package defpackage;

import android.view.View;
import java.util.List;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15293e extends AbstractC5224e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C11109e f30216e = new C11109e(5, this);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C13465e f30217e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C17515e f30218e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final List f30219e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final List f30220e;

    public C15293e() {
        C5264e c5264e = new C5264e(this);
        C7947e.ad.getClass();
        this.f30219e = AbstractC6874e.startapp(c5264e, ((Boolean) C7947e.license.ad()).booleanValue() ? new C8510e() : new C11188e());
        VKXApplication.Companion companion = VKXApplication.f36531e;
        this.f30220e = AbstractC6874e.startapp(VKXApplication.Companion.vip(R.string.odin_tab_library), VKXApplication.Companion.vip(R.string.odin_tab_cache));
    }

    @Override // defpackage.AbstractC5224e, defpackage.AbstractC10716e, defpackage.AbstractC13859e
    public final void applovin() {
        super.applovin();
        this.f30216e.license();
    }

    @Override // defpackage.AbstractC5224e
    /* renamed from: final */
    public final List mo373final() {
        return this.f30219e;
    }

    @Override // defpackage.AbstractC13859e
    public final void isVip() {
        ((AppActivity) pro()).ad().ad(this.f30216e, this);
        InterfaceC5083e interfaceC5083e = null;
        int i = 28;
        C9042e c9042e = new C9042e(this, interfaceC5083e, i);
        C5981e c5981e = AbstractC15448e.ad;
        C11318e c11318e = new C11318e(new C7371e(AbstractC15448e.vip, 25), new C17806e(c9042e, interfaceC5083e, i), 3);
        C4891e c4891e = this.f27449e;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(c11318e, c4891e, EnumC7785e.f15779e), AbstractC4608e.metrica(c4891e));
    }

    @Override // defpackage.AbstractC5224e
    /* renamed from: new */
    public final List mo374new() {
        return this.f30220e;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(1:3)|4|(1:6)|7|(2:9|(25:11|(1:13)|14|(1:16)|17|(1:19)|20|(1:22)|23|(1:25)(1:54)|26|(1:28)|29|30|(1:32)|33|(1:37)|38|(1:40)|41|42|43|(1:45)|46|47))|55|(1:57)|58|30|(0)|33|(2:35|37)(2:52|37)|38|(0)|41|42|43|(0)|46|47) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0104, code lost:
    
        r2 = new defpackage.C12763e(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /* renamed from: package, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3925package() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15293e.m3925package():void");
    }

    /* renamed from: private, reason: not valid java name */
    public final void m3926private() {
        this.f30217e = null;
        View view = ((AbstractC3655e) this.f30219e.get(0)).f21115e;
        if (view == null) {
            view = null;
        }
        ((C6559e) view).setEnabled(true);
        C6977e c6977e = this.f11121e;
        if (c6977e == null) {
            c6977e = null;
        }
        c6977e.setPagingEnabled(true);
        C17515e c17515e = this.f30218e;
        (c17515e != null ? c17515e : null).loadAd(0);
        this.f30216e.appmetrica(false);
    }

    @Override // defpackage.AbstractC5224e
    /* renamed from: strictfp */
    public final void mo377strictfp(int i, float f) {
        C17515e c17515e = this.f30218e;
        if (c17515e == null) {
            c17515e = null;
        }
        AbstractC18491e abstractC18491e = c17515e.billing;
        ((C17954e) (abstractC18491e != null ? abstractC18491e : null)).loadAd(i, f);
    }

    @Override // defpackage.AbstractC5224e
    /* renamed from: super */
    public final int mo1775super() {
        VKXApplication.Companion companion = VKXApplication.f36531e;
        return !VKXApplication.Companion.metrica() ? 1 : 0;
    }

    @Override // defpackage.AbstractC5224e, defpackage.AbstractC10716e
    /* renamed from: try */
    public final AbstractC18491e mo216try() {
        C17515e c17515e = new C17515e(new C2946e(this, 7), new C2946e(this, 8));
        this.f30218e = c17515e;
        return c17515e;
    }
}
