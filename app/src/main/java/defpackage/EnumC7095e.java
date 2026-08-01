package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC7095e {
    VISIBILITY(0),
    MODALITY(1),
    OVERRIDE(2),
    ANNOTATIONS(3),
    INNER(4),
    MEMBER_KIND(5),
    DATA(6),
    INLINE(7),
    EXPECT(8),
    ACTUAL(9),
    CONST(10),
    LATEINIT(11),
    FUN(12),
    VALUE(13);


    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final Set f14550e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final Set f14554e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f14564e;

    static {
        EnumC7095e[] values = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC7095e enumC7095e : values) {
            if (enumC7095e.f14564e) {
                arrayList.add(enumC7095e);
            }
        }
        f14554e = AbstractC13480e.m3582e(arrayList);
        f14550e = AbstractC1660e.m664case(values());
    }

    EnumC7095e(int i) {
        this.f14564e = r2;
    }
}
