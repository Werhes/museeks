package defpackage;

import android.util.Log;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٗؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3409e extends AbstractC10347e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C16330e f7621e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C0576e f7622e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C5363e f7623e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final C16529e f7624e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C16330e f7625e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C0576e f7626e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C5977e f7627e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C17157e f7628e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f7629e;

    public C3409e() {
        super(0);
        this.f7623e = new C5363e(new C15442e(this, 2));
        this.f7622e = AbstractC14533e.startapp(C1492e.ad);
        this.f7626e = AbstractC14533e.startapp(null);
        this.f7629e = AbstractC14533e.startapp(null);
        this.f7621e = new C16330e(0);
        this.f7625e = new C16330e(0);
        this.f7627e = new C5977e(this, 0);
        this.f7628e = new C17157e(this, 0);
        C16529e c16529e = AbstractC2800e.ad;
        this.f7624e = new C16529e();
    }

    @Override // defpackage.AbstractC10347e, defpackage.AbstractC10716e, defpackage.AbstractC13859e
    public final void applovin() {
        super.applovin();
        C8130e m1358transient = m1358transient();
        m1358transient.mopub.metrica(m1358transient, "advertising");
        m1358transient().startapp();
    }

    @Override // defpackage.AbstractC10716e
    /* renamed from: case */
    public final void mo734case() {
        if (AbstractC7890e.billing(m1352import(), C11599e.ad) || AbstractC7890e.billing(m1352import(), C2069e.ad)) {
            return;
        }
        super.mo734case();
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        int i2;
        C3409e c3409e = this;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1560259242);
        int i3 = i | (c13770e2.yandex(c3409e) ? 4 : 2);
        boolean z = true;
        if (c13770e2.m3673protected(i3 & 1, (i3 & 3) != 2)) {
            int startapp = AbstractC4533e.startapp(0.0f, c13770e2, 0, 1);
            AbstractC15946e.ad(c13770e2, 0);
            if (!AbstractC7890e.billing(c3409e.m1352import(), C11599e.ad) && !AbstractC7890e.billing(c3409e.m1352import(), C2069e.ad)) {
                z = false;
            }
            Object m3681throw = c13770e2.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = new C13630e(1);
                c13770e2.m3682throws(m3681throw);
            }
            AbstractC9186e.ad(z, (Function0) m3681throw, c13770e2, 48);
            C6571e c6571e = (C6571e) c3409e.f7626e.getValue();
            if (c6571e == null) {
                c13770e2.m3676strictfp(-1546637045);
                c13770e2.Signature(false);
                i2 = startapp;
            } else {
                c13770e2.m3676strictfp(-1546637044);
                String str = (String) c6571e.f13544e;
                C6524e c6524e = (C6524e) c6571e.f13543e;
                boolean yandex = c13770e2.yandex(c3409e) | c13770e2.purchase(str);
                Object m3681throw2 = c13770e2.m3681throw();
                if (yandex || m3681throw2 == c5170e) {
                    m3681throw2 = new C6414e(c3409e, str, 2);
                    c13770e2.m3682throws(m3681throw2);
                }
                i2 = startapp;
                AbstractC3199e.m1314interface((Function0) m3681throw2, null, null, 0.0f, false, null, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.Signature, 0L, 0.0f, 0L, null, null, null, AbstractC16653e.license(-2053824695, new C8124e(c6524e, c3409e, str, 18), c13770e2), c13770e, 0, 8126);
                c13770e2 = c13770e;
                c13770e2.Signature(false);
            }
            c3409e = this;
            AbstractC13348e.ad(null, AbstractC16653e.license(-1951015918, new C3939e(this, 1, (byte) 0), c13770e2), null, null, null, 0, 0L, 0L, ((C0916e) c13770e2.adcel(AbstractC12450e.ad)).license(c13770e2), AbstractC16653e.license(-597437721, new C3174e(this, i2, 0), c13770e2), c13770e2, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3939e(c3409e, i);
        }
    }

    /* renamed from: import, reason: not valid java name */
    public final InterfaceC5726e m1352import() {
        return (InterfaceC5726e) this.f7622e.getValue();
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final void m1353instanceof(String str, InterfaceC5353e interfaceC5353e) {
        C18382e c18382e = AbstractC0852e.ad;
        c18382e.getClass();
        byte[] metrica = c18382e.metrica(InterfaceC5353e.Companion.serializer(), interfaceC5353e);
        C0473e c0473e = C2180e.startapp;
        m1358transient().yandex(str, new C2180e(UUID.randomUUID().getLeastSignificantBits(), 1, metrica, null, null));
    }

    /* renamed from: package, reason: not valid java name */
    public final void m1354package() {
        C16529e c16529e = this.f7624e;
        Object[] objArr = c16529e.metrica;
        long[] jArr = c16529e.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            InterfaceC10500e interfaceC10500e = (InterfaceC10500e) objArr[(i << 3) + i3];
                            if (interfaceC10500e.purchase()) {
                                interfaceC10500e.Signature(null);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        c16529e.ad();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eؗؗۡ, java.lang.Object] */
    @Override // defpackage.AbstractC13859e
    public final void premium() {
        super.premium();
        m1357synchronized(C1492e.ad);
        C8130e m1358transient = m1358transient();
        String ad = AbstractC0852e.ad();
        ?? obj = new Object();
        obj.f10041e = true;
        obj.f10034e = true;
        obj.f10057e = true;
        obj.f10031e = true;
        obj.f10062e = false;
        obj.f10059e = true;
        obj.f10035e = true;
        obj.f10049e = true;
        obj.f10033e = false;
        obj.f10032e = false;
        obj.f10037e = false;
        obj.f10043e = 0;
        obj.f10044e = 0;
        obj.f10038e = 0L;
        obj.f10064e = false;
        obj.f10036e = true;
        obj.f10051e = false;
        obj.f10058e = true;
        obj.f10047e = true;
        obj.f10048e = 0;
        obj.f10045e = true;
        obj.f10040e = 0;
        obj.f10052e = false;
        obj.f10039e = true;
        obj.f10056e = true;
        obj.f10053e = true;
        obj.f10061e = C6611e.f13632e;
        int[] iArr = obj.f10060e;
        if (iArr != null && iArr.length > 0) {
            obj.f10031e = false;
            obj.f10057e = false;
            obj.f10035e = false;
            obj.f10049e = false;
            obj.f10059e = false;
            obj.f10032e = false;
            for (int i : iArr) {
                if (i == 2) {
                    obj.f10057e = true;
                } else if (i == 9) {
                    obj.f10032e = true;
                } else if (i != 11) {
                    if (i == 4) {
                        obj.f10031e = true;
                    } else if (i == 5) {
                        obj.f10059e = true;
                    } else if (i == 6) {
                        obj.f10049e = true;
                    } else if (i != 7) {
                        Log.d("NearbyConnections", "Illegal advertising medium " + i);
                    } else {
                        obj.f10035e = true;
                    }
                }
            }
        }
        int[] iArr2 = obj.f10050e;
        if (iArr2 != null && iArr2.length > 0) {
            obj.f10051e = false;
            int i2 = 0;
            while (true) {
                int[] iArr3 = obj.f10050e;
                if (i2 >= iArr3.length) {
                    break;
                }
                if (iArr3[i2] == 9) {
                    obj.f10051e = true;
                    break;
                }
                i2++;
            }
        }
        int i3 = obj.f10048e;
        if (i3 == 0) {
            obj.f10048e = true == obj.f10062e ? 1 : 3;
        } else {
            obj.f10062e = i3 != 3;
        }
        int i4 = obj.f10040e;
        if (i4 != 0) {
            obj.f10036e = i4 == 1;
        } else if (!obj.f10036e) {
            obj.f10040e = 2;
        }
        m1358transient.getClass();
        C2580e license = m1358transient.license(new C16471e(m1358transient, this.f7627e), AbstractC1346e.class.getName());
        C2580e ad2 = m1358transient.mopub.ad(m1358transient, new Object(), "advertising");
        C18381e c18381e = m1358transient.mopub;
        C18100e purchase = C10312e.purchase();
        purchase.f35495e = ad2;
        purchase.f35492e = new C6029e(m1358transient, ad, license, (C4681e) obj);
        purchase.f35489e = C5107e.f10954e;
        purchase.f35491e = 1266;
        C0560e vip = c18381e.vip(m1358transient, purchase.vip());
        vip.purchase(AbstractC10468e.ad, new C0211e(11, new C0609e(24, this)));
        vip.metrica(new C0211e(12, this));
    }

    /* renamed from: private, reason: not valid java name */
    public final void m1355private(Function0 function0, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(685366503);
        int i2 = i | (c13770e2.yandex(function0) ? 4 : 2);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C9577e c9577e = C5438e.f11678e;
            C13964e billing = AbstractC16497e.billing(8);
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e mopub = AbstractC12220e.mopub(c0115e, 16);
            C4789e ad = AbstractC14801e.ad(billing, c9577e, c13770e2, 54);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, mopub);
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
            AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_check, 0, c13770e2), null, AbstractC18007e.startapp(c0115e, 72), 0L, c13770e2, 440, 8);
            AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, R.string.cdcm_wizard_complete), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
            AbstractC1513e.ad(function0, null, false, null, null, null, null, null, AbstractC11160e.appmetrica, c13770e, (i2 & 14) | 805306368, 510);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C1743e(this, function0, i, 7);
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m1356strictfp(C12604e c12604e, Function0 function0, C13770e c13770e, int i) {
        c13770e.m3671package(2044958647);
        int i2 = i | (c13770e.purchase(c12604e) ? 4 : 2) | (c13770e.yandex(function0) ? 32 : 16) | (c13770e.yandex(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            AbstractC13348e.ad(null, null, AbstractC16653e.license(-606203268, new C14903e(1, function0), c13770e), null, null, 0, 0L, 0L, AbstractC3338e.ad, AbstractC16653e.license(-394996922, new C3235e(c12604e, this, 0), c13770e), c13770e, 805306752, 251);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4197e(i, 4, this, c12604e, function0);
        }
    }

    /* renamed from: synchronized, reason: not valid java name */
    public final void m1357synchronized(InterfaceC5726e interfaceC5726e) {
        this.f7622e.setValue(interfaceC5726e);
    }

    /* renamed from: transient, reason: not valid java name */
    public final C8130e m1358transient() {
        return (C8130e) this.f7623e.getValue();
    }
}
