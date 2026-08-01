package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓ۠ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2147e extends Handler {
    public static final C2147e ad = new Handler();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC4830e.ad;
        String loggerName = logRecord.getLoggerName();
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        AbstractC4830e.ad(loggerName, intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3, logRecord.getMessage(), logRecord.getThrown());
    }
}
