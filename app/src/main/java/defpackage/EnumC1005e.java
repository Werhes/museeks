package defpackage;

import java.util.HashMap;
import java.util.logging.Level;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؒٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1005e {
    /* JADX INFO: Fake field, exist only in values array */
    ALL(Level.ALL),
    /* JADX INFO: Fake field, exist only in values array */
    TRACE(Level.FINEST),
    /* JADX INFO: Fake field, exist only in values array */
    DEBUG(Level.FINER),
    /* JADX INFO: Fake field, exist only in values array */
    INFO(Level.FINE),
    /* JADX INFO: Fake field, exist only in values array */
    WARN(Level.WARNING),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(Level.SEVERE),
    /* JADX INFO: Fake field, exist only in values array */
    CRITICAL(new Level() { // from class: eْۛٔ
    }),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(Level.OFF);


    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Level f3457e;

    static {
        HashMap hashMap = new HashMap(8);
        for (EnumC1005e enumC1005e : values()) {
            hashMap.put(enumC1005e.f3457e, enumC1005e);
        }
        Unit unit = Unit.INSTANCE;
    }

    EnumC1005e(Level level) {
        this.f3457e = level;
    }
}
