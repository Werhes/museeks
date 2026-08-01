package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17425e implements InterfaceC14230e {
    public final C11744e ad;
    public C8823e adcel;
    public final C1326e appmetrica = new AbstractC9790e(0);
    public final int billing;
    public C5425e license;
    public final boolean metrica;
    public final boolean purchase;
    public C8823e startapp;
    public InterfaceC7865e vip;
    public final C1326e yandex;

    /* JADX WARN: Type inference failed for: r5v2, types: [eٍ۟ۤ, eؒۛ٘] */
    /* JADX WARN: Type inference failed for: r6v2, types: [eٍ۟ۤ, eؒۛ٘] */
    public C17425e(C13825e c13825e, C11744e c11744e) {
        this.ad = c11744e;
        this.metrica = C17150e.purchase(c13825e);
        boolean z = false;
        C6434e c6434e = InterfaceC2531e.yandex;
        InterfaceC2531e interfaceC2531e = c13825e.vip;
        c6434e.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && AbstractC0879e.purchase(interfaceC2531e)) {
            z = true;
        }
        this.purchase = z;
        int license = i >= 35 ? AbstractC0879e.license(interfaceC2531e) : 1;
        this.billing = license;
        if (i >= 35) {
            AbstractC0879e.appmetrica(interfaceC2531e);
        }
        this.yandex = new AbstractC9790e(Integer.valueOf(license));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C8823e ad(C17425e c17425e, boolean z, int i) {
        int i2;
        InterfaceC1908e interfaceC1908e;
        int i3 = 2;
        boolean z2 = (i & 2) != 0;
        C11744e c11744e = c17425e.ad;
        if (AbstractC9464e.smaato("CXCP")) {
            StringBuilder sb = new StringBuilder("TorchControl#setTorchAsync: torch mode = ");
            sb.append((Object) ("TorchMode(value=" + (z ? 1 : 0) + ')'));
            Log.d("CXCP", sb.toString());
        }
        C8823e c8823e = new C8823e();
        if (c17425e.metrica) {
            InterfaceC7865e interfaceC7865e = c17425e.vip;
            if (interfaceC7865e != null) {
                c17425e.metrica(z ? 1 : 0);
                if (z2) {
                    C8823e c8823e2 = c17425e.startapp;
                    if (c8823e2 != null) {
                        AbstractC17861e.isPro("There is a new enableTorch being set", c8823e2);
                    }
                    c17425e.startapp = null;
                } else {
                    C8823e c8823e3 = c17425e.startapp;
                    if (c8823e3 != null) {
                        AbstractC16398e.metrica(c8823e, c8823e3);
                    }
                }
                c17425e.startapp = c8823e;
                Integer num = z ? 1 : null;
                synchronized (c11744e.license) {
                    c11744e.mopub = num;
                    Unit unit = Unit.INSTANCE;
                }
                c11744e.purchase();
                List list = C6510e.vip;
                C6510e advert = AbstractC12797e.advert(c11744e.appmetrica());
                if (advert != null) {
                    i2 = advert.ad;
                } else {
                    if (AbstractC9464e.admob()) {
                        Log.w("CXCP", "TorchControl#setTorchAsync: Failed to convert ae mode of value " + c11744e.appmetrica() + " with AeMode.fromIntOrNull, fallback to AeMode.ON");
                    }
                    i2 = 1;
                }
                if (z) {
                    if (z) {
                        Integer num2 = (Integer) c17425e.yandex.license();
                        if (num2 != null) {
                            c17425e.license(num2.intValue());
                        }
                    } else {
                        c17425e.license(c17425e.billing);
                    }
                    interfaceC1908e = interfaceC7865e.vip();
                } else {
                    interfaceC1908e = interfaceC7865e.purchase(i2);
                }
                ((C6467e) interfaceC1908e).mo692else(new C9041e(interfaceC1908e, c8823e, new C13887e(i3)));
            } else {
                AbstractC17861e.isPro("Camera is not active.", c8823e);
            }
        } else {
            c8823e.m2503e(new IllegalStateException("No flash unit"));
        }
        return c8823e;
    }

    public final void license(int i) {
        InterfaceC1908e adcel;
        C8823e c8823e = new C8823e();
        if (Build.VERSION.SDK_INT < 35 || !this.purchase) {
            c8823e.m2503e(new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
            return;
        }
        C8823e c8823e2 = this.adcel;
        if (c8823e2 != null) {
            if (c8823e2 != null) {
                AbstractC17861e.isPro("There is a new torch strength being set", c8823e2);
            }
            this.adcel = null;
        }
        this.adcel = c8823e;
        c8823e.mo692else(new C17955e(16, this));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC0879e.billing(linkedHashMap, i);
        InterfaceC7865e interfaceC7865e = this.vip;
        if (interfaceC7865e == null || (adcel = interfaceC7865e.adcel(linkedHashMap, AbstractC13788e.vip)) == null) {
            AbstractC17861e.isPro("Camera is not active.", c8823e);
        } else {
            AbstractC16398e.metrica(adcel, c8823e);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void metrica(int i) {
        this.license = new C5425e(i);
        int i2 = i != 1 ? 0 : 1;
        boolean purchase = AbstractC13062e.purchase();
        C1326e c1326e = this.appmetrica;
        if (purchase) {
            c1326e.startapp(Integer.valueOf(i2));
        } else {
            c1326e.adcel(Integer.valueOf(i2));
        }
    }

    @Override // defpackage.InterfaceC14230e
    public final void reset() {
        C8823e c8823e = this.startapp;
        if (c8823e != null) {
            AbstractC17861e.isPro("There is a new enableTorch being set", c8823e);
        }
        this.startapp = null;
        C8823e c8823e2 = this.adcel;
        if (c8823e2 != null) {
            AbstractC17861e.isPro("There is a new torch strength being set", c8823e2);
        }
        this.adcel = null;
        if (this.license != null) {
            metrica(0);
            ad(this, false, 6);
            this.license = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r2.intValue() == 1) goto L11;
     */
    @Override // defpackage.InterfaceC14230e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip(defpackage.InterfaceC7865e r2) {
        /*
            r1 = this;
            r1.vip = r2
            eؘؕۦ r2 = r1.license
            if (r2 == 0) goto L1e
            eؒۛ٘ r2 = r1.appmetrica
            java.lang.Object r2 = r2.license()
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L11
            goto L19
        L11:
            int r2 = r2.intValue()
            r0 = 1
            if (r2 != r0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            r2 = 4
            ad(r1, r0, r2)
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17425e.vip(eًُۖ):void");
    }
}
