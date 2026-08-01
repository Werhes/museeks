package defpackage;

import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۥِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16625e extends AbstractC10347e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C0576e f32587e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C0576e f32588e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C0576e f32589e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C0576e f32590e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f32591e;

    public AbstractC16625e() {
        super(0);
        C7838e c7838e = VKXApplication.f36530e;
        this.f32589e = AbstractC14533e.startapp((c7838e == null ? null : c7838e).f15868e.license);
        C7838e c7838e2 = VKXApplication.f36530e;
        this.f32588e = AbstractC14533e.startapp((c7838e2 == null ? null : c7838e2).appmetrica());
        C7838e c7838e3 = VKXApplication.f36530e;
        C14609e vip = (c7838e3 == null ? null : c7838e3).vip();
        this.f32590e = AbstractC14533e.startapp(vip != null ? vip.vip : null);
        C7838e c7838e4 = VKXApplication.f36530e;
        c7838e4 = c7838e4 == null ? null : c7838e4;
        c7838e4.getClass();
        this.f32591e = AbstractC14533e.startapp((C14751e) c7838e4.yandex(new C1586e(c7838e4, 13)));
        C7838e c7838e5 = VKXApplication.f36530e;
        C7838e c7838e6 = c7838e5 != null ? c7838e5 : null;
        c7838e6.getClass();
        Boolean bool = (Boolean) c7838e6.yandex(new C1586e(c7838e6, 19));
        bool.booleanValue();
        this.f32587e = AbstractC14533e.startapp(bool);
    }

    @Override // defpackage.AbstractC13859e
    public void isVip() {
        InterfaceC5083e interfaceC5083e = null;
        int i = 0;
        C5468e c5468e = new C5468e(this, interfaceC5083e, i);
        C5981e c5981e = AbstractC15448e.ad;
        C4013e c4013e = AbstractC15448e.vip;
        int i2 = 28;
        C11318e c11318e = new C11318e(new C5786e(c4013e, i2), new C1695e(c5468e, interfaceC5083e, 22), 3);
        C4891e c4891e = this.f27449e;
        EnumC7785e enumC7785e = EnumC7785e.f15779e;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(c11318e, c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
        int i3 = 1;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(new C11318e(new C5786e(c4013e, 29), new C1695e(new C5468e(this, interfaceC5083e, i3), interfaceC5083e, 24), 3), c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(new C11318e(new C7371e(c4013e, i), new C1695e(new C5468e(this, interfaceC5083e, 2), interfaceC5083e, 26), 3), c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(new C11318e(new C7371e(c4013e, i3), new C1695e(new C5468e(this, interfaceC5083e, 3), interfaceC5083e, i2), 3), c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
    }

    /* renamed from: package, reason: not valid java name */
    public final AbstractC16049e m4166package() {
        return (AbstractC16049e) this.f32590e.getValue();
    }

    /* renamed from: private, reason: not valid java name */
    public final EnumC11342e m4167private() {
        return (EnumC11342e) this.f32588e.getValue();
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final InterfaceC1686e m4168strictfp() {
        return (InterfaceC1686e) this.f32589e.getValue();
    }
}
