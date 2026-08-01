package defpackage;

import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3373e extends AbstractC16510e {
    public static final C11460e subs = new Object();
    public C12417e ads;
    public C16480e applovin;
    public C16990e inmobi;
    public C11980e isPro;
    public C13319e isVip;
    public final C10215e premium;
    public final AtomicReference pro;
    public final int remoteconfig;
    public int signatures;
    public Rational tapsense;

    public C3373e(C5753e c5753e) {
        super(c5753e);
        this.pro = new AtomicReference(null);
        this.signatures = -1;
        this.tapsense = null;
        this.premium = new C10215e(this);
        C5753e c5753e2 = (C5753e) this.yandex;
        C14326e c14326e = C5753e.f12173e;
        c5753e2.getClass();
        if (((C17015e) c5753e2.mopub()).mo812extends(c14326e)) {
            this.remoteconfig = ((Integer) c5753e2.subscription(c14326e)).intValue();
        } else {
            this.remoteconfig = 1;
        }
        ((Integer) ((C17015e) c5753e2.mopub()).smaato(C5753e.f12174e, 0)).getClass();
        this.isVip = new C13319e((InterfaceC14003e) ((C17015e) c5753e2.mopub()).smaato(C5753e.f12176e, null));
    }

    /* renamed from: extends, reason: not valid java name */
    public static boolean m1342extends(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC16510e
    public final void ads() {
        C13319e c13319e = this.isVip;
        c13319e.vip();
        c13319e.ad();
        C16480e c16480e = this.applovin;
        if (c16480e != null) {
            c16480e.vip();
        }
        m1343goto(false);
        appmetrica().yandex(null);
    }

    @Override // defpackage.AbstractC16510e
    public final InterfaceC16100e advert(InterfaceC12330e interfaceC12330e) {
        return new C3186e(C4069e.purchase(interfaceC12330e), 1);
    }

    @Override // defpackage.AbstractC16510e
    public final C6884e applovin(C6884e c6884e, C6884e c6884e2) {
        AbstractC9464e.yandex("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + c6884e + ", secondaryStreamSpec " + c6884e2);
        C16990e m1345this = m1345this(purchase(), (C5753e) this.yandex, c6884e);
        this.inmobi = m1345this;
        Object[] objArr = {m1345this.metrica()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4158class(DesugarCollections.unmodifiableList(arrayList));
        Signature();
        return c6884e;
    }

    @Override // defpackage.AbstractC16510e
    public final InterfaceC12438e billing(boolean z, InterfaceC4311e interfaceC4311e) {
        subs.getClass();
        C5753e c5753e = C11460e.ad;
        c5753e.getClass();
        InterfaceC12330e ad = interfaceC4311e.ad(AbstractC8647e.ad(c5753e), this.remoteconfig);
        if (z) {
            ad = AbstractC13501e.remoteconfig(ad, c5753e);
        }
        if (ad == null) {
            return null;
        }
        return new C5753e(C17015e.vip(((C3186e) advert(ad)).f7297e));
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m1343goto(boolean z) {
        C16480e c16480e;
        Log.d("ImageCapture", "clearPipeline");
        AbstractC13062e.metrica();
        C12417e c12417e = this.ads;
        if (c12417e != null) {
            c12417e.vip();
            this.ads = null;
        }
        C11980e c11980e = this.isPro;
        if (c11980e != null) {
            c11980e.m3304try();
            this.isPro = null;
        }
        if (!z && (c16480e = this.applovin) != null) {
            c16480e.vip();
            this.applovin = null;
        }
        appmetrica().ad();
    }

    @Override // defpackage.AbstractC16510e
    public final void inmobi() {
        C13319e c13319e = this.isVip;
        c13319e.vip();
        c13319e.ad();
        C16480e c16480e = this.applovin;
        if (c16480e != null) {
            c16480e.vip();
        }
    }

    @Override // defpackage.AbstractC16510e
    public final C6884e isPro(InterfaceC12330e interfaceC12330e) {
        this.inmobi.ad(interfaceC12330e);
        Object[] objArr = {this.inmobi.metrica()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4158class(DesugarCollections.unmodifiableList(arrayList));
        C10017e vip = this.startapp.vip();
        vip.f19790e = interfaceC12330e;
        return vip.ad();
    }

    @Override // defpackage.AbstractC16510e
    public final Set mopub() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    /* renamed from: native, reason: not valid java name */
    public final int m1344native() {
        int i;
        synchronized (this.pro) {
            i = this.signatures;
            if (i == -1) {
                C5753e c5753e = (C5753e) this.yandex;
                c5753e.getClass();
                i = ((Integer) AbstractC0054e.Signature(c5753e, C5753e.f12171e, 2)).intValue();
            }
        }
        return i;
    }

    @Override // defpackage.AbstractC16510e
    public final void pro() {
        AbstractC9464e.yandex("ImageCapture", "onCameraControlReady");
        m1347while();
        appmetrica().yandex(this.isVip);
    }

    @Override // defpackage.AbstractC16510e
    public final void remoteconfig() {
        AbstractC4265e.billing(license(), "Attached camera cannot be null");
        if (m1344native() == 3) {
            InterfaceC2881e license = license();
            if ((license != null ? license.vip().admob() : -1) != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // defpackage.AbstractC16510e
    public final InterfaceC12438e signatures(InterfaceC12424e interfaceC12424e, InterfaceC16100e interfaceC16100e) {
        Integer valueOf = Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        HashSet<AbstractC3677e> hashSet = this.billing;
        boolean z = false;
        if (hashSet != null) {
            for (AbstractC3677e abstractC3677e : hashSet) {
            }
            ((C4069e) interfaceC16100e.isVip()).yandex(C5753e.f12170e, 0);
        }
        if (interfaceC12424e.firebase().ad(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            InterfaceC12330e isVip = interfaceC16100e.isVip();
            C14326e c14326e = C5753e.f12177e;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(((C17015e) isVip).smaato(c14326e, bool2))) {
                AbstractC9464e.remoteconfig("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                AbstractC9464e.advert("ImageCapture", "Requesting software JPEG due to device quirk.");
                ((C4069e) interfaceC16100e.isVip()).yandex(c14326e, bool2);
            }
        }
        InterfaceC12330e isVip2 = interfaceC16100e.isVip();
        Boolean bool3 = Boolean.TRUE;
        C14326e c14326e2 = C5753e.f12177e;
        Boolean bool4 = Boolean.FALSE;
        C17015e c17015e = (C17015e) isVip2;
        if (bool3.equals(c17015e.smaato(c14326e2, bool4))) {
            if (license() != null) {
                ((C6594e) license().yandex()).m2230transient();
            }
            Integer num = (Integer) c17015e.smaato(C5753e.f12175e, null);
            if (num == null || num.intValue() == 256) {
                z = true;
            } else {
                AbstractC9464e.remoteconfig("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z) {
                AbstractC9464e.remoteconfig("ImageCapture", "Unable to support software JPEG. Disabling.");
                ((C4069e) isVip2).yandex(c14326e2, bool4);
            }
        }
        Integer num2 = (Integer) ((C17015e) interfaceC16100e.isVip()).smaato(C5753e.f12175e, null);
        if (num2 != null) {
            if (license() != null) {
                ((C6594e) license().yandex()).m2230transient();
            }
            ((C4069e) interfaceC16100e.isVip()).yandex(InterfaceC14405e.isPro, Integer.valueOf(z ? 35 : num2.intValue()));
        } else {
            InterfaceC12330e isVip3 = interfaceC16100e.isVip();
            C14326e c14326e3 = C5753e.f12170e;
            if (Objects.equals(((C17015e) isVip3).smaato(c14326e3, null), 2)) {
                ((C4069e) interfaceC16100e.isVip()).yandex(InterfaceC14405e.isPro, 32);
            } else if (Objects.equals(((C17015e) interfaceC16100e.isVip()).smaato(c14326e3, null), 3)) {
                ((C4069e) interfaceC16100e.isVip()).yandex(InterfaceC14405e.isPro, 32);
                ((C4069e) interfaceC16100e.isVip()).yandex(InterfaceC14405e.applovin, valueOf);
            } else if (Objects.equals(((C17015e) interfaceC16100e.isVip()).smaato(c14326e3, null), 1)) {
                ((C4069e) interfaceC16100e.isVip()).yandex(InterfaceC14405e.isPro, 4101);
                ((C4069e) interfaceC16100e.isVip()).yandex(InterfaceC14405e.ads, C14677e.metrica);
            } else if (z) {
                ((C4069e) interfaceC16100e.isVip()).yandex(InterfaceC14405e.isPro, 35);
            } else {
                List list = (List) ((C17015e) interfaceC16100e.isVip()).smaato(InterfaceC13842e.f27424this, null);
                if (list == null) {
                    ((C4069e) interfaceC16100e.isVip()).yandex(InterfaceC14405e.isPro, valueOf);
                } else if (m1342extends(PSKKeyManager.MAX_KEY_LENGTH_BYTES, list)) {
                    ((C4069e) interfaceC16100e.isVip()).yandex(InterfaceC14405e.isPro, valueOf);
                } else if (m1342extends(35, list)) {
                    ((C4069e) interfaceC16100e.isVip()).yandex(InterfaceC14405e.isPro, 35);
                }
            }
        }
        return interfaceC16100e.mo819interface();
    }

    @Override // defpackage.AbstractC16510e
    public final boolean smaato() {
        return true;
    }

    @Override // defpackage.AbstractC16510e
    public final void tapsense(int i) {
        m1346throw(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c3  */
    /* renamed from: this, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C16990e m1345this(java.lang.String r17, defpackage.C5753e r18, defpackage.C6884e r19) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3373e.m1345this(java.lang.String, eؘؘٜ, eؚؓٝ):eؘٗٓ");
    }

    /* renamed from: throw, reason: not valid java name */
    public final void m1346throw(int i) {
        int mo1768else = ((InterfaceC13842e) this.yandex).mo1768else(0);
        if (!subs(i) || this.tapsense == null) {
            return;
        }
        this.tapsense = AbstractC15428e.metrica(Math.abs(AbstractC3425e.billing(i) - AbstractC3425e.billing(mo1768else)), this.tapsense);
    }

    public final String toString() {
        return "ImageCapture:".concat(yandex());
    }

    /* renamed from: while, reason: not valid java name */
    public final void m1347while() {
        synchronized (this.pro) {
            try {
                if (this.pro.get() != null) {
                    return;
                }
                appmetrica().billing(m1344native());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
