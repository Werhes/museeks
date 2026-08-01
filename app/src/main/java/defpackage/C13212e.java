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
/* renamed from: eِْۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13212e extends AbstractC0641e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C13212e f26218e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final C13141e f26219e = new C13141e(22);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f26220e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public C13212e f26221e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f26222e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f26223e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f26224e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f26225e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public List f26226e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC6732e f26227e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public int f26228e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C13212e f26229e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f26230e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f26231e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f26232e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public byte f26233e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public List f26234e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f26235e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C13212e f26236e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f26237e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public int f26238e;

    static {
        C13212e c13212e = new C13212e();
        f26218e = c13212e;
        c13212e.admob();
    }

    public C13212e() {
        this.f26233e = (byte) -1;
        this.f26238e = -1;
        this.f26227e = AbstractC6732e.f13911e;
    }

    public C13212e(C3333e c3333e) {
        super(c3333e);
        this.f26233e = (byte) -1;
        this.f26238e = -1;
        this.f26227e = c3333e.f19037e;
    }

    public C13212e(C4285e c4285e, C18521e c18521e) {
        this.f26233e = (byte) -1;
        this.f26238e = -1;
        admob();
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int admob = c4285e.admob();
                    C13141e c13141e = f26219e;
                    C3333e c3333e = null;
                    switch (admob) {
                        case 0:
                            break;
                        case 8:
                            this.f26223e |= 4096;
                            this.f26228e = c4285e.amazon();
                            continue;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            if ((i & 1) != 1) {
                                this.f26234e = new ArrayList();
                                i |= 1;
                            }
                            this.f26234e.add(c4285e.adcel(C16578e.f32522e, c18521e));
                            continue;
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                            this.f26223e |= 1;
                            this.f26220e = c4285e.loadAd() != 0;
                            continue;
                        case 32:
                            this.f26223e |= 2;
                            this.f26237e = c4285e.amazon();
                            continue;
                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                            if ((this.f26223e & 4) == 4) {
                                C13212e c13212e = this.f26236e;
                                c13212e.getClass();
                                c3333e = subscription(c13212e);
                            }
                            C13212e c13212e2 = (C13212e) c4285e.adcel(c13141e, c18521e);
                            this.f26236e = c13212e2;
                            if (c3333e != null) {
                                c3333e.startapp(c13212e2);
                                this.f26236e = c3333e.billing();
                            }
                            this.f26223e |= 4;
                            continue;
                        case 48:
                            this.f26223e |= 16;
                            this.f26235e = c4285e.amazon();
                            continue;
                        case 56:
                            this.f26223e |= 32;
                            this.f26224e = c4285e.amazon();
                            continue;
                        case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                            this.f26223e |= 8;
                            this.f26231e = c4285e.amazon();
                            continue;
                        case 72:
                            this.f26223e |= 64;
                            this.f26232e = c4285e.amazon();
                            continue;
                        case 82:
                            if ((this.f26223e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                                C13212e c13212e3 = this.f26221e;
                                c13212e3.getClass();
                                c3333e = subscription(c13212e3);
                            }
                            C13212e c13212e4 = (C13212e) c4285e.adcel(c13141e, c18521e);
                            this.f26221e = c13212e4;
                            if (c3333e != null) {
                                c3333e.startapp(c13212e4);
                                this.f26221e = c3333e.billing();
                            }
                            this.f26223e |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            continue;
                        case 88:
                            this.f26223e |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                            this.f26225e = c4285e.amazon();
                            continue;
                        case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                            this.f26223e |= 128;
                            this.f26222e = c4285e.amazon();
                            continue;
                        case 106:
                            if ((this.f26223e & 1024) == 1024) {
                                C13212e c13212e5 = this.f26229e;
                                c13212e5.getClass();
                                c3333e = subscription(c13212e5);
                            }
                            C13212e c13212e6 = (C13212e) c4285e.adcel(c13141e, c18521e);
                            this.f26229e = c13212e6;
                            if (c3333e != null) {
                                c3333e.startapp(c13212e6);
                                this.f26229e = c3333e.billing();
                            }
                            this.f26223e |= 1024;
                            continue;
                        case 112:
                            this.f26223e |= 2048;
                            this.f26230e = c4285e.amazon();
                            continue;
                        case 802:
                            if ((i & 16384) != 16384) {
                                this.f26226e = new ArrayList();
                                i |= 16384;
                            }
                            this.f26226e.add(c4285e.adcel(C4599e.f9905e, c18521e));
                            continue;
                        default:
                            if (!amazon(c4285e, m2672protected, c18521e, admob)) {
                                break;
                            } else {
                                break;
                            }
                    }
                    z = true;
                } catch (C14226e e) {
                    e.f28108e = this;
                    throw e;
                } catch (IOException e2) {
                    C14226e c14226e = new C14226e(e2.getMessage());
                    c14226e.f28108e = this;
                    throw c14226e;
                }
            } catch (Throwable th) {
                if ((i & 1) == 1) {
                    this.f26234e = DesugarCollections.unmodifiableList(this.f26234e);
                }
                if ((i & 16384) == 16384) {
                    this.f26226e = DesugarCollections.unmodifiableList(this.f26226e);
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f26227e = c1974e.purchase();
                    throw th2;
                }
                this.f26227e = c1974e.purchase();
                smaato();
                throw th;
            }
        }
        if ((i & 1) == 1) {
            this.f26234e = DesugarCollections.unmodifiableList(this.f26234e);
        }
        if ((i & 16384) == 16384) {
            this.f26226e = DesugarCollections.unmodifiableList(this.f26226e);
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f26227e = c1974e.purchase();
            throw th3;
        }
        this.f26227e = c1974e.purchase();
        smaato();
    }

    public static C3333e subscription(C13212e c13212e) {
        C3333e yandex = C3333e.yandex();
        yandex.startapp(c13212e);
        return yandex;
    }

    public final boolean Signature() {
        return (this.f26223e & 16) == 16;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f26233e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f26234e.size(); i++) {
            if (!((C16578e) this.f26234e.get(i)).ad()) {
                this.f26233e = (byte) 0;
                return false;
            }
        }
        if ((this.f26223e & 4) == 4 && !this.f26236e.ad()) {
            this.f26233e = (byte) 0;
            return false;
        }
        if ((this.f26223e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 && !this.f26221e.ad()) {
            this.f26233e = (byte) 0;
            return false;
        }
        if ((this.f26223e & 1024) == 1024 && !this.f26229e.ad()) {
            this.f26233e = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f26226e.size(); i2++) {
            if (!((C4599e) this.f26226e.get(i2)).ad()) {
                this.f26233e = (byte) 0;
                return false;
            }
        }
        if (startapp()) {
            this.f26233e = (byte) 1;
            return true;
        }
        this.f26233e = (byte) 0;
        return false;
    }

    public final void admob() {
        List list = Collections.EMPTY_LIST;
        this.f26234e = list;
        this.f26220e = false;
        this.f26237e = 0;
        C13212e c13212e = f26218e;
        this.f26236e = c13212e;
        this.f26231e = 0;
        this.f26235e = 0;
        this.f26224e = 0;
        this.f26232e = 0;
        this.f26222e = 0;
        this.f26221e = c13212e;
        this.f26225e = 0;
        this.f26229e = c13212e;
        this.f26230e = 0;
        this.f26228e = 0;
        this.f26226e = list;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C3333e.yandex();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f26238e;
        if (i != -1) {
            return i;
        }
        int Signature = (this.f26223e & 4096) == 4096 ? C9831e.Signature(1, this.f26228e) : 0;
        for (int i2 = 0; i2 < this.f26234e.size(); i2++) {
            Signature += C9831e.subscription(2, (AbstractC6649e) this.f26234e.get(i2));
        }
        if ((this.f26223e & 1) == 1) {
            Signature += C9831e.tapsense(3) + 1;
        }
        if ((this.f26223e & 2) == 2) {
            Signature += C9831e.Signature(4, this.f26237e);
        }
        if ((this.f26223e & 4) == 4) {
            Signature += C9831e.subscription(5, this.f26236e);
        }
        if ((this.f26223e & 16) == 16) {
            Signature += C9831e.Signature(6, this.f26235e);
        }
        if ((this.f26223e & 32) == 32) {
            Signature += C9831e.Signature(7, this.f26224e);
        }
        if ((this.f26223e & 8) == 8) {
            Signature += C9831e.Signature(8, this.f26231e);
        }
        if ((this.f26223e & 64) == 64) {
            Signature += C9831e.Signature(9, this.f26232e);
        }
        if ((this.f26223e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            Signature += C9831e.subscription(10, this.f26221e);
        }
        if ((this.f26223e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            Signature += C9831e.Signature(11, this.f26225e);
        }
        if ((this.f26223e & 128) == 128) {
            Signature += C9831e.Signature(12, this.f26222e);
        }
        if ((this.f26223e & 1024) == 1024) {
            Signature += C9831e.subscription(13, this.f26229e);
        }
        if ((this.f26223e & 2048) == 2048) {
            Signature += C9831e.Signature(14, this.f26230e);
        }
        for (int i3 = 0; i3 < this.f26226e.size(); i3++) {
            Signature += C9831e.subscription(100, (AbstractC6649e) this.f26226e.get(i3));
        }
        int size = this.f26227e.size() + adcel() + Signature;
        this.f26238e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        C18540e c18540e = new C18540e(this);
        if ((this.f26223e & 4096) == 4096) {
            c9831e.m2695for(1, this.f26228e);
        }
        for (int i = 0; i < this.f26234e.size(); i++) {
            c9831e.m2704public(2, (AbstractC6649e) this.f26234e.get(i));
        }
        if ((this.f26223e & 1) == 1) {
            boolean z = this.f26220e;
            c9831e.m2691e(3, 0);
            c9831e.m2688e(z ? 1 : 0);
        }
        if ((this.f26223e & 2) == 2) {
            c9831e.m2695for(4, this.f26237e);
        }
        if ((this.f26223e & 4) == 4) {
            c9831e.m2704public(5, this.f26236e);
        }
        if ((this.f26223e & 16) == 16) {
            c9831e.m2695for(6, this.f26235e);
        }
        if ((this.f26223e & 32) == 32) {
            c9831e.m2695for(7, this.f26224e);
        }
        if ((this.f26223e & 8) == 8) {
            c9831e.m2695for(8, this.f26231e);
        }
        if ((this.f26223e & 64) == 64) {
            c9831e.m2695for(9, this.f26232e);
        }
        if ((this.f26223e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            c9831e.m2704public(10, this.f26221e);
        }
        if ((this.f26223e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            c9831e.m2695for(11, this.f26225e);
        }
        if ((this.f26223e & 128) == 128) {
            c9831e.m2695for(12, this.f26222e);
        }
        if ((this.f26223e & 1024) == 1024) {
            c9831e.m2704public(13, this.f26229e);
        }
        if ((this.f26223e & 2048) == 2048) {
            c9831e.m2695for(14, this.f26230e);
        }
        for (int i2 = 0; i2 < this.f26226e.size(); i2++) {
            c9831e.m2704public(100, (AbstractC6649e) this.f26226e.get(i2));
        }
        c18540e.m4583synchronized(200, c9831e);
        c9831e.m2690e(this.f26227e);
    }

    @Override // defpackage.AbstractC6649e
    /* renamed from: remoteconfig, reason: merged with bridge method [inline-methods] */
    public final C3333e appmetrica() {
        return subscription(this);
    }

    @Override // defpackage.InterfaceC8149e
    public final AbstractC6649e vip() {
        return f26218e;
    }
}
