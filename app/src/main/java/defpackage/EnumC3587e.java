package defpackage;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3587e {
    /* JADX INFO: Fake field, exist only in values array */
    ENGINEER("engineer"),
    /* JADX INFO: Fake field, exist only in values array */
    MIXER("mix"),
    /* JADX INFO: Fake field, exist only in values array */
    DJMIXER("DJ-mix"),
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCER("producer"),
    /* JADX INFO: Fake field, exist only in values array */
    ARRANGER("arranger");


    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final HashMap f8109e = new HashMap();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f8110e;

    static {
        Iterator it = EnumSet.allOf(EnumC3587e.class).iterator();
        while (it.hasNext()) {
            EnumC3587e enumC3587e = (EnumC3587e) it.next();
            f8109e.put(enumC3587e.f8110e, enumC3587e);
        }
    }

    EnumC3587e(String str) {
        this.f8110e = str;
    }
}
