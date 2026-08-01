package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12524e implements InterfaceC8808e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final EnumC3021e f25072e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC10498e f25073e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C15768e f25074e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final EnumC13541e f25075e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f25076e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Integer f25077e;

    public C12524e(String str, C15768e c15768e, AbstractC10498e abstractC10498e, EnumC13541e enumC13541e, EnumC3021e enumC3021e, Integer num) {
        this.f25076e = str;
        this.f25074e = c15768e;
        this.f25073e = abstractC10498e;
        this.f25075e = enumC13541e;
        this.f25072e = enumC3021e;
        this.f25077e = num;
    }

    public static C12524e ad(String str, AbstractC10498e abstractC10498e, EnumC13541e enumC13541e, EnumC3021e enumC3021e, Integer num) {
        if (enumC3021e == EnumC3021e.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C12524e(str, AbstractC6336e.ad(str), abstractC10498e, enumC13541e, enumC3021e, num);
    }
}
