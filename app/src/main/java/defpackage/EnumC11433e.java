package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؐۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC11433e {
    f22984e("utf-8", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("windows-1252", false);


    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final HashMap f22983e = new HashMap();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f22986e;

    static {
        for (EnumC11433e enumC11433e : values()) {
            f22983e.put(enumC11433e.f22986e, enumC11433e);
        }
    }

    EnumC11433e(String str, boolean z) {
        this.f22986e = str;
    }
}
