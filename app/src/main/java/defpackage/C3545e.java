package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؕۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3545e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C13141e f7985e = new C13141e(7);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C3545e f7986e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public float f7987e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f7988e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f7989e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public EnumC0791e f7990e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C4599e f7991e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public byte f7992e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f7993e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f7994e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f7995e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public List f7996e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f7997e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f7998e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f7999e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f8000e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public double f8001e;

    static {
        C3545e c3545e = new C3545e();
        f7986e = c3545e;
        c3545e.startapp();
    }

    public C3545e() {
        this.f7992e = (byte) -1;
        this.f7994e = -1;
        this.f7999e = AbstractC6732e.f13911e;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public C3545e(C4285e c4285e, C18521e c18521e) {
        C2766e c2766e;
        this.f7992e = (byte) -1;
        this.f7994e = -1;
        startapp();
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        boolean z = false;
        char c = 0;
        while (true) {
            ?? r5 = 256;
            if (z) {
                if ((c & 256) == 256) {
                    this.f7996e = DesugarCollections.unmodifiableList(this.f7996e);
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f7999e = c1974e.purchase();
                    throw th;
                }
                this.f7999e = c1974e.purchase();
                return;
            }
            try {
                try {
                    try {
                        int admob = c4285e.admob();
                        switch (admob) {
                            case 0:
                                z = true;
                            case 8:
                                int amazon = c4285e.amazon();
                                EnumC0791e vip = EnumC0791e.vip(amazon);
                                if (vip == null) {
                                    m2672protected.m2689e(admob);
                                    m2672protected.m2689e(amazon);
                                } else {
                                    this.f7993e |= 1;
                                    this.f7990e = vip;
                                }
                            case 16:
                                this.f7993e |= 2;
                                long loadAd = c4285e.loadAd();
                                this.f7997e = (-(loadAd & 1)) ^ (loadAd >>> 1);
                            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                this.f7993e |= 4;
                                this.f7987e = Float.intBitsToFloat(c4285e.advert());
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                this.f7993e |= 8;
                                this.f8001e = Double.longBitsToDouble(c4285e.smaato());
                            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                this.f7993e |= 16;
                                this.f8000e = c4285e.amazon();
                            case 48:
                                this.f7993e |= 32;
                                this.f7995e = c4285e.amazon();
                            case 56:
                                this.f7993e |= 64;
                                this.f7998e = c4285e.amazon();
                            case 66:
                                if ((this.f7993e & 128) == 128) {
                                    C4599e c4599e = this.f7991e;
                                    c4599e.getClass();
                                    c2766e = new C2766e(0);
                                    c2766e.f6672e = Collections.EMPTY_LIST;
                                    c2766e.startapp(c4599e);
                                } else {
                                    c2766e = null;
                                }
                                C4599e c4599e2 = (C4599e) c4285e.adcel(C4599e.f9905e, c18521e);
                                this.f7991e = c4599e2;
                                if (c2766e != null) {
                                    c2766e.startapp(c4599e2);
                                    this.f7991e = c2766e.purchase();
                                }
                                this.f7993e |= 128;
                            case 74:
                                if ((c & 256) != 256) {
                                    this.f7996e = new ArrayList();
                                    c = 256;
                                }
                                this.f7996e.add(c4285e.adcel(f7985e, c18521e));
                            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                this.f7993e |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                                this.f7988e = c4285e.amazon();
                            case 88:
                                this.f7993e |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                this.f7989e = c4285e.amazon();
                            default:
                                r5 = c4285e.signatures(admob, m2672protected);
                                if (r5 == 0) {
                                    z = true;
                                }
                        }
                    } catch (IOException e) {
                        C14226e c14226e = new C14226e(e.getMessage());
                        c14226e.f28108e = this;
                        throw c14226e;
                    }
                } catch (C14226e e2) {
                    e2.f28108e = this;
                    throw e2;
                }
            } catch (Throwable th2) {
                if ((c & 256) == r5) {
                    this.f7996e = DesugarCollections.unmodifiableList(this.f7996e);
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f7999e = c1974e.purchase();
                    throw th3;
                }
                this.f7999e = c1974e.purchase();
                throw th2;
            }
        }
    }

    public C3545e(C11877e c11877e) {
        this.f7992e = (byte) -1;
        this.f7994e = -1;
        this.f7999e = c11877e.f19037e;
    }

    public static C11877e adcel(C3545e c3545e) {
        C11877e billing = C11877e.billing();
        billing.yandex(c3545e);
        return billing;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f7992e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f7993e & 128) == 128 && !this.f7991e.ad()) {
            this.f7992e = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f7996e.size(); i++) {
            if (!((C3545e) this.f7996e.get(i)).ad()) {
                this.f7992e = (byte) 0;
                return false;
            }
        }
        this.f7992e = (byte) 1;
        return true;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        return adcel(this);
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C11877e.billing();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f7994e;
        if (i != -1) {
            return i;
        }
        int loadAd = (this.f7993e & 1) == 1 ? C9831e.loadAd(1, this.f7990e.f3181e) : 0;
        if ((this.f7993e & 2) == 2) {
            long j = this.f7997e;
            loadAd += C9831e.signatures((j >> 63) ^ (j << 1)) + C9831e.tapsense(2);
        }
        if ((this.f7993e & 4) == 4) {
            loadAd += C9831e.tapsense(3) + 4;
        }
        if ((this.f7993e & 8) == 8) {
            loadAd += C9831e.tapsense(4) + 8;
        }
        if ((this.f7993e & 16) == 16) {
            loadAd += C9831e.Signature(5, this.f8000e);
        }
        if ((this.f7993e & 32) == 32) {
            loadAd += C9831e.Signature(6, this.f7995e);
        }
        if ((this.f7993e & 64) == 64) {
            loadAd += C9831e.Signature(7, this.f7998e);
        }
        if ((this.f7993e & 128) == 128) {
            loadAd += C9831e.subscription(8, this.f7991e);
        }
        for (int i2 = 0; i2 < this.f7996e.size(); i2++) {
            loadAd += C9831e.subscription(9, (AbstractC6649e) this.f7996e.get(i2));
        }
        if ((this.f7993e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            loadAd += C9831e.Signature(10, this.f7988e);
        }
        if ((this.f7993e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            loadAd += C9831e.Signature(11, this.f7989e);
        }
        int size = this.f7999e.size() + loadAd;
        this.f7994e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        if ((this.f7993e & 1) == 1) {
            c9831e.m2715volatile(1, this.f7990e.f3181e);
        }
        if ((this.f7993e & 2) == 2) {
            long j = this.f7997e;
            c9831e.m2691e(2, 0);
            c9831e.m2687e((j >> 63) ^ (j << 1));
        }
        if ((this.f7993e & 4) == 4) {
            float f = this.f7987e;
            c9831e.m2691e(3, 5);
            c9831e.m2684e(Float.floatToRawIntBits(f));
        }
        if ((this.f7993e & 8) == 8) {
            double d = this.f8001e;
            c9831e.m2691e(4, 1);
            c9831e.m2686e(Double.doubleToRawLongBits(d));
        }
        if ((this.f7993e & 16) == 16) {
            c9831e.m2695for(5, this.f8000e);
        }
        if ((this.f7993e & 32) == 32) {
            c9831e.m2695for(6, this.f7995e);
        }
        if ((this.f7993e & 64) == 64) {
            c9831e.m2695for(7, this.f7998e);
        }
        if ((this.f7993e & 128) == 128) {
            c9831e.m2704public(8, this.f7991e);
        }
        for (int i = 0; i < this.f7996e.size(); i++) {
            c9831e.m2704public(9, (AbstractC6649e) this.f7996e.get(i));
        }
        if ((this.f7993e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            c9831e.m2695for(10, this.f7988e);
        }
        if ((this.f7993e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            c9831e.m2695for(11, this.f7989e);
        }
        c9831e.m2690e(this.f7999e);
    }

    public final void startapp() {
        this.f7990e = EnumC0791e.BYTE;
        this.f7997e = 0L;
        this.f7987e = 0.0f;
        this.f8001e = 0.0d;
        this.f8000e = 0;
        this.f7995e = 0;
        this.f7998e = 0;
        this.f7991e = C4599e.f9906e;
        this.f7996e = Collections.EMPTY_LIST;
        this.f7989e = 0;
        this.f7988e = 0;
    }
}
