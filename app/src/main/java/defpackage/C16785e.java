package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٗؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16785e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C18478e f32888e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ C7838e f32889e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f32890e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f32891e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ C18478e f32892e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f32893e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f32894e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C7838e f32895e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16785e(C18478e c18478e, C7838e c7838e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f32892e = c18478e;
        this.f32889e = c7838e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C16785e(this.f32892e, this.f32889e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C16785e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x004e: IF  (r0v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:20:0x0053, block:B:18:0x004e */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i;
        int i2;
        int i3 = this.f32890e;
        try {
        } catch (Exception e) {
            if (i3 == i) {
                e.printStackTrace();
                throw e;
            }
            i2 = i3 + 1;
        }
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = this.f32893e;
            int i5 = this.f32891e;
            int i6 = this.f32894e;
            C7838e c7838e = this.f32895e;
            C18478e c18478e = this.f32888e;
            AbstractC2003e.purchase(obj);
            return obj;
        }
        AbstractC2003e.purchase(obj);
        new Exception("This should not be visible here!");
        C18478e c18478e2 = this.f32892e;
        C7838e c7838e2 = this.f32889e;
        i2 = 0;
        i = 3;
        C11800e c11800e = c7838e2.f15868e;
        InterfaceC1686e interfaceC1686e = c11800e.license;
        this.f32888e = c18478e2;
        this.f32895e = c7838e2;
        this.f32894e = i;
        this.f32891e = 0;
        this.f32893e = i2;
        this.f32890e = 1;
        Serializable m4544import = c18478e2.m4544import(c11800e, interfaceC1686e, this);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        return m4544import == enumC2821e ? enumC2821e : m4544import;
    }
}
