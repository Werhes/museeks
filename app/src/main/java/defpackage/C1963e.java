package defpackage;

import android.util.Log;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1963e extends AbstractC10347e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C0576e f5152e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C0576e f5153e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C5363e f5154e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public C8419e f5155e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final C17038e f5156e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final C17157e f5157e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C16330e f5158e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C12742e f5159e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C16330e f5160e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C5977e f5161e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f5162e;

    public C1963e() {
        super(0);
        this.f5154e = new C5363e(new C15597e(this, 2));
        this.f5153e = AbstractC14533e.startapp(C2100e.ad);
        this.f5159e = new C12742e();
        this.f5162e = AbstractC14533e.startapp(null);
        this.f5152e = AbstractC14533e.startapp(null);
        this.f5158e = new C16330e(0);
        this.f5160e = new C16330e(0);
        this.f5161e = new C5977e(this, 1);
        this.f5157e = new C17157e(this, 1);
        this.f5156e = new C17038e(this);
    }

    @Override // defpackage.AbstractC10347e, defpackage.AbstractC10716e, defpackage.AbstractC13859e
    public final void applovin() {
        super.applovin();
        C8130e m739transient = m739transient();
        m739transient.mopub.metrica(m739transient, "discovery").appmetrica(new C3432e(m739transient));
        m739transient().startapp();
        C8419e c8419e = this.f5155e;
        if (c8419e != null) {
            c8419e.Signature(null);
        }
    }

    @Override // defpackage.AbstractC10716e
    /* renamed from: case, reason: not valid java name */
    public final void mo734case() {
        if (AbstractC7890e.billing((InterfaceC3851e) this.f5153e.getValue(), C4192e.ad)) {
            return;
        }
        super.mo734case();
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        C5170e c5170e;
        int i2;
        C1963e c1963e = this;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-519168432);
        int i3 = i | (c13770e2.yandex(c1963e) ? 4 : 2);
        if (c13770e2.m3673protected(i3 & 1, (i3 & 3) != 2)) {
            int startapp = AbstractC4533e.startapp(0.0f, c13770e2, 0, 1);
            AbstractC15946e.ad(c13770e2, 0);
            C6571e c6571e = (C6571e) c1963e.f5162e.getValue();
            C5170e c5170e2 = C2987e.ad;
            if (c6571e == null) {
                c13770e2.m3676strictfp(-369311535);
                c13770e2.Signature(false);
                i2 = startapp;
                c5170e = c5170e2;
            } else {
                c13770e2.m3676strictfp(-369311534);
                String str = (String) c6571e.f13544e;
                C6524e c6524e = (C6524e) c6571e.f13543e;
                boolean yandex = c13770e2.yandex(c1963e) | c13770e2.purchase(str);
                Object m3681throw = c13770e2.m3681throw();
                if (yandex || m3681throw == c5170e2) {
                    m3681throw = new C13555e(c1963e, str, 0);
                    c13770e2.m3682throws(m3681throw);
                }
                c5170e = c5170e2;
                i2 = startapp;
                AbstractC3199e.m1314interface((Function0) m3681throw, null, null, 0.0f, false, null, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.Signature, 0L, 0.0f, 0L, null, null, null, AbstractC16653e.license(-575530365, new C8124e(c6524e, c1963e, str, 19), c13770e2), c13770e, 0, 8126);
                c13770e2 = c13770e;
                c13770e2.Signature(false);
                c1963e = this;
            }
            boolean billing = AbstractC7890e.billing((InterfaceC3851e) c1963e.f5153e.getValue(), C4192e.ad);
            Object m3681throw2 = c13770e2.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C13630e(2);
                c13770e2.m3682throws(m3681throw2);
            }
            AbstractC9186e.ad(billing, (Function0) m3681throw2, c13770e2, 48);
            AbstractC13348e.ad(null, AbstractC16653e.license(-953261556, new C10019e(c1963e, 2), c13770e2), null, null, null, 0, 0L, 0L, ((C0916e) c13770e2.adcel(AbstractC12450e.ad)).license(c13770e2), AbstractC16653e.license(1409244321, new C3174e(c1963e, i2, 1), c13770e2), c13770e2, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C10019e(c1963e, i, 3);
        }
    }

    /* renamed from: import, reason: not valid java name */
    public final void m735import(InterfaceC3851e interfaceC3851e) {
        this.f5153e.setValue(interfaceC3851e);
    }

    /* renamed from: package, reason: not valid java name */
    public final void m736package(Function0 function0, C13770e c13770e, int i) {
        c13770e.m3671package(-1941641567);
        int i2 = i | (c13770e.yandex(function0) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            AbstractC13348e.ad(null, null, AbstractC16653e.license(-1657209988, new C14903e(2, function0), c13770e), null, null, 0, 0L, 0L, AbstractC3338e.ad, AbstractC7844e.startapp, c13770e, 805306752, 251);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7353e(this, function0, i, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eِۤ, java.lang.Object] */
    @Override // defpackage.AbstractC13859e
    public final void premium() {
        super.premium();
        m735import(C2100e.ad);
        C8130e m739transient = m739transient();
        ?? obj = new Object();
        obj.f36204e = false;
        obj.f36200e = true;
        obj.f36211e = true;
        obj.f36197e = false;
        obj.f36214e = true;
        obj.f36208e = true;
        obj.f36212e = true;
        obj.f36201e = false;
        obj.f36209e = 0;
        obj.f36199e = 0;
        obj.f36202e = 0L;
        obj.f36207e = true;
        obj.f36205e = false;
        obj.f36203e = true;
        obj.f36210e = true;
        obj.f36213e = C6611e.f13632e;
        int[] iArr = obj.f36206e;
        if (iArr != null && iArr.length > 0) {
            obj.f36211e = false;
            obj.f36200e = false;
            obj.f36208e = false;
            obj.f36212e = false;
            obj.f36214e = false;
            for (int i : iArr) {
                if (i == 2) {
                    obj.f36200e = true;
                } else if (i != 11) {
                    if (i == 4) {
                        obj.f36211e = true;
                    } else if (i == 5) {
                        obj.f36214e = true;
                    } else if (i == 6) {
                        obj.f36212e = true;
                    } else if (i != 7) {
                        Log.d("NearbyConnections", "Illegal discovery medium " + i);
                    } else {
                        obj.f36208e = true;
                    }
                }
            }
        }
        C2580e ad = m739transient.mopub.ad(m739transient, this.f5156e, "discovery");
        C18381e c18381e = m739transient.mopub;
        C18100e purchase = C10312e.purchase();
        purchase.f35495e = ad;
        purchase.f35492e = new C17659e(m739transient, ad, (C18473e) obj);
        purchase.f35489e = C10990e.f21766e;
        purchase.f35491e = 1267;
        C0560e vip = c18381e.vip(m739transient, purchase.vip());
        C9271e c9271e = new C9271e(m739transient, (Object) obj);
        ExecutorC14432e executorC14432e = AbstractC10468e.ad;
        vip.purchase(executorC14432e, c9271e);
        vip.license(executorC14432e, C6114e.f12849e);
        vip.purchase(executorC14432e, new C0211e(13, new C12875e(this, 1)));
        vip.metrica(new C0211e(14, this));
    }

    /* renamed from: private, reason: not valid java name */
    public final void m737private(Function0 function0, C13770e c13770e, int i) {
        c13770e.m3671package(-1335050571);
        int i2 = i | (c13770e.yandex(function0) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            AbstractC13348e.ad(null, null, AbstractC16653e.license(-1107606214, new C14903e(3, function0), c13770e), null, null, 0, 0L, 0L, AbstractC3338e.ad, AbstractC7844e.billing, c13770e, 805306752, 251);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7353e(this, function0, i, 1);
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m738strictfp(C13770e c13770e, int i) {
        C1963e c1963e;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(199917350);
        int i2 = i | (c13770e2.yandex(this) ? 4 : 2);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C13964e billing = AbstractC16497e.billing(8);
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e smaato = AbstractC12220e.smaato(c0115e, 16, 0.0f, 2);
            C4789e ad = AbstractC14801e.ad(billing, C5438e.f11672e, c13770e2, 6);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, smaato);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            String appmetrica = AbstractC5297e.appmetrica(c13770e2, R.string.cdcm_sender_info_devices);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e2.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.amazon, c13770e, 48, 0, 131064);
            c13770e2 = c13770e;
            c1963e = this;
            AbstractC0865e.ad(AbstractC18007e.purchase(c0115e, 0.0f, 320, 1), null, null, null, null, AbstractC16653e.license(312732734, new C6599e(13, c1963e), c13770e2), c13770e2, 196614, 30);
            c13770e2.Signature(true);
        } else {
            c1963e = this;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C10019e(c1963e, i, 1);
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public final C8130e m739transient() {
        return (C8130e) this.f5154e.getValue();
    }
}
