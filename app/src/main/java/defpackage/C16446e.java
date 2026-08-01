package defpackage;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۘؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16446e {
    public C11447e Signature;
    public final InterfaceC3828e ad;
    public float adcel;
    public int admob;
    public C17985e advert;
    public boolean amazon;
    public RectF inmobi;
    public boolean isVip;
    public C14434e loadAd;
    public AbstractC14073e mopub;
    public long pro;
    public Outline purchase;
    public boolean remoteconfig;
    public long signatures;
    public C17985e smaato;
    public long tapsense;
    public InterfaceC14388e vip = AbstractC14753e.ad;
    public EnumC7792e metrica = EnumC7792e.f15794e;
    public Function1 license = C8082e.f16412e;
    public final C17097e appmetrica = new C17097e(18, this);
    public boolean billing = true;
    public long yandex = 0;
    public long startapp = 9205357640488583168L;
    public final C12344e subscription = new C12344e(4);

    static {
        Build.FINGERPRINT.toLowerCase(Locale.ROOT).equals("robolectric");
    }

    public C16446e(InterfaceC3828e interfaceC3828e) {
        this.ad = interfaceC3828e;
        interfaceC3828e.crashlytics(false);
        this.pro = 0L;
        this.signatures = 0L;
        this.tapsense = 9205357640488583168L;
    }

    public final void ad() {
        Outline outline;
        if (this.billing) {
            boolean z = this.isVip;
            Outline outline2 = null;
            InterfaceC3828e interfaceC3828e = this.ad;
            if (z || interfaceC3828e.mo283throw() > 0.0f) {
                C17985e c17985e = this.advert;
                if (c17985e != null) {
                    RectF rectF = this.inmobi;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.inmobi = rectF;
                    }
                    boolean z2 = c17985e instanceof C17985e;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    c17985e.ad.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || c17985e.ad.isConvex()) {
                        outline = this.purchase;
                        if (outline == null) {
                            outline = new Outline();
                            this.purchase = outline;
                        }
                        if (i >= 30) {
                            AbstractC5096e.signatures(outline, c17985e);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(c17985e.ad);
                        }
                        this.amazon = !outline.canClip();
                    } else {
                        Outline outline3 = this.purchase;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.amazon = true;
                        outline = null;
                    }
                    this.advert = c17985e;
                    if (outline != null) {
                        outline.setAlpha(interfaceC3828e.ad());
                        outline2 = outline;
                    }
                    interfaceC3828e.yandex(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.amazon && this.isVip) {
                        interfaceC3828e.crashlytics(false);
                        interfaceC3828e.adcel();
                    } else {
                        interfaceC3828e.crashlytics(this.isVip);
                    }
                } else {
                    interfaceC3828e.crashlytics(this.isVip);
                    Outline outline4 = this.purchase;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.purchase = outline4;
                    }
                    Outline outline5 = outline4;
                    long startapp = AbstractC8116e.startapp(this.signatures);
                    long j = this.yandex;
                    long j2 = this.startapp;
                    long j3 = j2 == 9205357640488583168L ? startapp : j2;
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3)), this.adcel);
                    outline5.setAlpha(interfaceC3828e.ad());
                    interfaceC3828e.yandex(outline5, AbstractC8116e.purchase(j3));
                }
            } else {
                interfaceC3828e.crashlytics(false);
                interfaceC3828e.yandex(null, 0L);
            }
        }
        this.billing = false;
    }

    public final void appmetrica(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e, long j, Function1 function1) {
        boolean vip = C12729e.vip(this.signatures, j);
        InterfaceC3828e interfaceC3828e = this.ad;
        if (!vip) {
            this.signatures = j;
            long j2 = this.pro;
            interfaceC3828e.mopub((int) (j2 >> 32), j, (int) (j2 & 4294967295L));
            if (this.startapp == 9205357640488583168L) {
                this.billing = true;
                ad();
            }
        }
        this.vip = interfaceC14388e;
        this.metrica = enumC7792e;
        this.license = function1;
        interfaceC3828e.mo275class(interfaceC14388e, enumC7792e, this, this.appmetrica);
    }

    public final void billing(boolean z) {
        if (this.isVip != z) {
            this.isVip = z;
            this.billing = true;
            ad();
        }
    }

    public final AbstractC14073e license() {
        AbstractC14073e c14340e;
        AbstractC14073e abstractC14073e = this.mopub;
        C17985e c17985e = this.advert;
        if (abstractC14073e != null) {
            return abstractC14073e;
        }
        if (c17985e != null) {
            C10435e c10435e = new C10435e(c17985e);
            this.mopub = c10435e;
            return c10435e;
        }
        long startapp = AbstractC8116e.startapp(this.signatures);
        long j = this.yandex;
        long j2 = this.startapp;
        if (j2 != 9205357640488583168L) {
            startapp = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (startapp >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (startapp & 4294967295L)) + intBitsToFloat2;
        if (this.adcel > 0.0f) {
            c14340e = new C2904e(AbstractC13336e.ad(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            c14340e = new C14340e(new C0763e(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.mopub = c14340e;
        return c14340e;
    }

    public final void metrica(InterfaceC2235e interfaceC2235e) {
        C12344e c12344e = this.subscription;
        c12344e.f24751e = (C16446e) c12344e.f24749e;
        C12618e c12618e = (C12618e) c12344e.f24748e;
        if (c12618e != null && c12618e.startapp()) {
            C12618e c12618e2 = (C12618e) c12344e.f24753e;
            if (c12618e2 == null) {
                C12618e c12618e3 = AbstractC1710e.ad;
                c12618e2 = new C12618e();
                c12344e.f24753e = c12618e2;
            }
            c12618e2.mopub(c12618e);
            c12618e.vip();
        }
        c12344e.f24750e = true;
        this.license.invoke(interfaceC2235e);
        c12344e.f24750e = false;
        C16446e c16446e = (C16446e) c12344e.f24751e;
        if (c16446e != null) {
            c16446e.admob--;
            c16446e.vip();
        }
        C12618e c12618e4 = (C12618e) c12344e.f24753e;
        if (c12618e4 == null || !c12618e4.startapp()) {
            return;
        }
        Object[] objArr = c12618e4.vip;
        long[] jArr = c12618e4.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r10.admob--;
                            ((C16446e) objArr[(i << 3) + i3]).vip();
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
        c12618e4.vip();
    }

    public final void purchase(float f) {
        InterfaceC3828e interfaceC3828e = this.ad;
        if (interfaceC3828e.ad() == f) {
            return;
        }
        interfaceC3828e.signatures(f);
    }

    public final void startapp(long j, long j2, float f) {
        if (C2152e.vip(this.yandex, j) && C2108e.vip(this.startapp, j2) && this.adcel == f && this.advert == null) {
            return;
        }
        this.mopub = null;
        this.advert = null;
        this.billing = true;
        this.amazon = false;
        this.yandex = j;
        this.startapp = j2;
        this.adcel = f;
        ad();
    }

    public final void vip() {
        if (this.remoteconfig && this.admob == 0) {
            C12344e c12344e = this.subscription;
            C16446e c16446e = (C16446e) c12344e.f24749e;
            if (c16446e != null) {
                c16446e.admob--;
                c16446e.vip();
                c12344e.f24749e = null;
            }
            C12618e c12618e = (C12618e) c12344e.f24748e;
            if (c12618e != null) {
                Object[] objArr = c12618e.vip;
                long[] jArr = c12618e.ad;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.admob--;
                                    ((C16446e) objArr[(i << 3) + i3]).vip();
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
                c12618e.vip();
            }
            this.ad.adcel();
        }
    }

    public final void yandex(C9508e c9508e) {
        InterfaceC3828e interfaceC3828e = this.ad;
        if (AbstractC7890e.billing(interfaceC3828e.appmetrica(), c9508e)) {
            return;
        }
        interfaceC3828e.premium(c9508e);
    }
}
