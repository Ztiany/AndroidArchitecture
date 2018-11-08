package com.android.sdk.functional;

/**
 * Represents an operation that accepts a single input argument and returns no result. Unlike most
 * other functional interfaces, {@code Consumer} is expected to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a> whose functional method is
 * {@link #accept(double)}.
 *
 * @since 1.8
 */
public interface DoubleConsumer {

    /**
     * Performs this operation on the given argument.
     *
     * @param value the input argument
     */
    void accept(double value);
}
