package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15290e extends AbstractC5004e implements InterfaceC18435e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final /* synthetic */ C2691e f30211e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f30212e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C16955e f30213e;

    public C15290e(C16955e c16955e) {
        super(true, false);
        this.f30212e = AbstractC9743e.vip();
        this.f30211e = new C2691e(3);
        this.f30213e = c16955e;
    }

    public static void isVip(C14111e c14111e, C16955e c16955e) {
        c14111e.f27911e.setText("[" + c16955e.ad + '/' + c16955e.vip + "] " + c16955e.metrica);
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f30212e.f29359e;
    }

    @Override // defpackage.AbstractC5004e
    public final void amazon() {
        super.amazon();
        ((C13391e) this.f30211e.f6570e).f26645e = null;
    }

    @Override // defpackage.AbstractC5004e
    public final int billing() {
        return -1;
    }

    @Override // defpackage.AbstractC5004e
    public final void mopub() {
        super.mopub();
        C3972e c3972e = new C3972e(this, null, 0);
        C5981e c5981e = AbstractC15448e.ad;
        C4013e c4013e = AbstractC15448e.vip;
        C11318e c11318e = new C11318e(new C5786e(c4013e, 11), new C1853e(c3972e, (InterfaceC5083e) null, 13), 3);
        C4891e c4891e = this.f10590e;
        EnumC7785e enumC7785e = EnumC7785e.f15779e;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(c11318e, c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(new C11318e(new C5786e(c4013e, 12), new C1853e(new C3972e(this, null, 1), (InterfaceC5083e) null, 15), 3), c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
    }

    @Override // defpackage.AbstractC5004e
    public final void remoteconfig(View view) {
        C14111e c14111e = (C14111e) tapsense().f26645e;
        C16955e c16955e = this.f30213e;
        if (c16955e == null) {
            return;
        }
        isVip(c14111e, c16955e);
    }

    @Override // defpackage.AbstractC5004e
    public final View smaato(ViewGroup viewGroup) {
        Activity activity = this.f10582e;
        C13391e c13391e = (C13391e) this.f30211e.f6570e;
        Object invoke = ((Method) c13391e.f26644e).invoke(null, LayoutInflater.from(activity), viewGroup, Boolean.FALSE);
        if (invoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type ua.itaysonlab.vkx.databinding.V7CacheMigratorProgressBinding");
        }
        C14111e c14111e = (C14111e) invoke;
        c13391e.f26645e = c14111e;
        return c14111e.f27912e;
    }

    public final C13391e tapsense() {
        return (C13391e) this.f30211e.f6570e;
    }
}
