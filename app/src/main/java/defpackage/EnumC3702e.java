package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۢٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3702e {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0520e f8286e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0520e f8288e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final Set f8275e = AbstractC1660e.m664case(new EnumC3702e[]{CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE});

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f8285e = AbstractC18039e.appmetrica(2, new C3857e(this, 0));

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f8287e = AbstractC18039e.appmetrica(2, new C3857e(this, 1));

    EnumC3702e(String str) {
        this.f8288e = C0520e.appmetrica(str);
        this.f8286e = C0520e.appmetrica(str.concat("Array"));
    }
}
