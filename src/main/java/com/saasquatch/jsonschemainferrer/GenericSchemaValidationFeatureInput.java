package com.saasquatch.jsonschemainferrer;

import java.util.Collection;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.saasquatch.jsonschemainferrer.annotations.NoExternalImpl;

/**
 * Input for {@link GenericSchemaValidationFeature}
 *
 * @author sli
 */
@NoExternalImpl
public interface GenericSchemaValidationFeatureInput {

  /**
   * @return The current schema. Note that {@link GenericSchemaValidationFeature}s are not supposed
   *         to mutate the schema.
   */
  @Nonnull
  ObjectNode getSchema();

  /**
   * @return The current samples
   */
  @Nonnull
  Collection<? extends JsonNode> getSamples();

  /**
   * @return The current type, if available
   */
  @Nullable
  String getType();

  /**
   * @return The current {@link SpecVersion}
   */
  @Nonnull
  SpecVersion getSpecVersion();

}