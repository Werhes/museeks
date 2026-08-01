package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16162e extends AbstractC0641e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C13141e f31743e = new C13141e(24);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C16162e f31744e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f31745e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public List f31746e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public List f31747e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f31748e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f31749e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public byte f31750e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC6732e f31751e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f31752e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f31753e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public List f31754e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f31755e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C13212e f31756e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C13212e f31757e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public List f31758e;

    static {
        C16162e c16162e = new C16162e();
        f31744e = c16162e;
        c16162e.f31755e = 6;
        c16162e.f31745e = 0;
        List list = Collections.EMPTY_LIST;
        c16162e.f31758e = list;
        C13212e c13212e = C13212e.f26218e;
        c16162e.f31757e = c13212e;
        c16162e.f31753e = 0;
        c16162e.f31756e = c13212e;
        c16162e.f31749e = 0;
        c16162e.f31754e = list;
        c16162e.f31747e = list;
        c16162e.f31746e = list;
    }

    public C16162e() {
        this.f31750e = (byte) -1;
        this.f31752e = -1;
        this.f31751e = AbstractC6732e.f13911e;
    }

    public C16162e(C3191e c3191e) {
        super(c3191e);
        this.f31750e = (byte) -1;
        this.f31752e = -1;
        this.f31751e = c3191e.f19037e;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x003b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public C16162e(C4285e c4285e, C18521e c18521e) {
        this.f31750e = (byte) -1;
        this.f31752e = -1;
        this.f31755e = 6;
        boolean z = false;
        this.f31745e = 0;
        List list = Collections.EMPTY_LIST;
        this.f31758e = list;
        C13212e c13212e = C13212e.f26218e;
        this.f31757e = c13212e;
        this.f31753e = 0;
        this.f31756e = c13212e;
        this.f31749e = 0;
        this.f31754e = list;
        this.f31747e = list;
        this.f31746e = list;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        int i = 0;
        while (true) {
            ?? r5 = 128;
            if (z) {
                if ((i & 4) == 4) {
                    this.f31758e = DesugarCollections.unmodifiableList(this.f31758e);
                }
                if ((i & 128) == 128) {
                    this.f31754e = DesugarCollections.unmodifiableList(this.f31754e);
                }
                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.f31747e = DesugarCollections.unmodifiableList(this.f31747e);
                }
                if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
                    this.f31746e = DesugarCollections.unmodifiableList(this.f31746e);
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f31751e = c1974e.purchase();
                    throw th;
                }
                this.f31751e = c1974e.purchase();
                smaato();
                return;
            }
            try {
                try {
                    int admob = c4285e.admob();
                    C3333e c3333e = null;
                    switch (admob) {
                        case 0:
                            z = true;
                        case 8:
                            this.f31748e |= 1;
                            this.f31755e = c4285e.amazon();
                        case 16:
                            this.f31748e |= 2;
                            this.f31745e = c4285e.amazon();
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                            if ((i & 4) != 4) {
                                this.f31758e = new ArrayList();
                                i |= 4;
                            }
                            this.f31758e.add(c4285e.adcel(C8372e.f17124e, c18521e));
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                            if ((this.f31748e & 4) == 4) {
                                C13212e c13212e2 = this.f31757e;
                                c13212e2.getClass();
                                c3333e = C13212e.subscription(c13212e2);
                            }
                            C13212e c13212e3 = (C13212e) c4285e.adcel(C13212e.f26219e, c18521e);
                            this.f31757e = c13212e3;
                            if (c3333e != null) {
                                c3333e.startapp(c13212e3);
                                this.f31757e = c3333e.billing();
                            }
                            this.f31748e |= 4;
                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                            this.f31748e |= 8;
                            this.f31753e = c4285e.amazon();
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            if ((this.f31748e & 16) == 16) {
                                C13212e c13212e4 = this.f31756e;
                                c13212e4.getClass();
                                c3333e = C13212e.subscription(c13212e4);
                            }
                            C13212e c13212e5 = (C13212e) c4285e.adcel(C13212e.f26219e, c18521e);
                            this.f31756e = c13212e5;
                            if (c3333e != null) {
                                c3333e.startapp(c13212e5);
                                this.f31756e = c3333e.billing();
                            }
                            this.f31748e |= 16;
                        case 56:
                            this.f31748e |= 32;
                            this.f31749e = c4285e.amazon();
                        case 66:
                            if ((i & 128) != 128) {
                                this.f31754e = new ArrayList();
                                i |= 128;
                            }
                            this.f31754e.add(c4285e.adcel(C4599e.f9905e, c18521e));
                        case 248:
                            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                                this.f31747e = new ArrayList();
                                i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            }
                            this.f31747e.add(Integer.valueOf(c4285e.amazon()));
                        case 250:
                            int billing = c4285e.billing(c4285e.amazon());
                            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256 && c4285e.appmetrica() > 0) {
                                this.f31747e = new ArrayList();
                                i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            }
                            while (c4285e.appmetrica() > 0) {
                                this.f31747e.add(Integer.valueOf(c4285e.amazon()));
                            }
                            c4285e.purchase(billing);
                            break;
                        case 258:
                            if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 512) {
                                this.f31746e = new ArrayList();
                                i |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                            }
                            this.f31746e.add(c4285e.adcel(C18181e.f35596e, c18521e));
                        default:
                            r5 = amazon(c4285e, m2672protected, c18521e, admob);
                            if (r5 == 0) {
                                z = true;
                            }
                    }
                } catch (C14226e e) {
                    e.f28108e = this;
                    throw e;
                } catch (IOException e2) {
                    C14226e c14226e = new C14226e(e2.getMessage());
                    c14226e.f28108e = this;
                    throw c14226e;
                }
            } catch (Throwable th2) {
                if ((i & 4) == 4) {
                    this.f31758e = DesugarCollections.unmodifiableList(this.f31758e);
                }
                if ((i & 128) == r5) {
                    this.f31754e = DesugarCollections.unmodifiableList(this.f31754e);
                }
                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.f31747e = DesugarCollections.unmodifiableList(this.f31747e);
                }
                if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
                    this.f31746e = DesugarCollections.unmodifiableList(this.f31746e);
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f31751e = c1974e.purchase();
                    throw th3;
                }
                this.f31751e = c1974e.purchase();
                smaato();
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f31750e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f31748e & 2) != 2) {
            this.f31750e = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f31758e.size(); i++) {
            if (!((C8372e) this.f31758e.get(i)).ad()) {
                this.f31750e = (byte) 0;
                return false;
            }
        }
        if ((this.f31748e & 4) == 4 && !this.f31757e.ad()) {
            this.f31750e = (byte) 0;
            return false;
        }
        if ((this.f31748e & 16) == 16 && !this.f31756e.ad()) {
            this.f31750e = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f31754e.size(); i2++) {
            if (!((C4599e) this.f31754e.get(i2)).ad()) {
                this.f31750e = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f31746e.size(); i3++) {
            if (!((C18181e) this.f31746e.get(i3)).ad()) {
                this.f31750e = (byte) 0;
                return false;
            }
        }
        if (startapp()) {
            this.f31750e = (byte) 1;
            return true;
        }
        this.f31750e = (byte) 0;
        return false;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C3191e yandex = C3191e.yandex();
        yandex.startapp(this);
        return yandex;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C3191e.yandex();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f31752e;
        if (i != -1) {
            return i;
        }
        int Signature = (this.f31748e & 1) == 1 ? C9831e.Signature(1, this.f31755e) : 0;
        if ((this.f31748e & 2) == 2) {
            Signature += C9831e.Signature(2, this.f31745e);
        }
        for (int i2 = 0; i2 < this.f31758e.size(); i2++) {
            Signature += C9831e.subscription(3, (AbstractC6649e) this.f31758e.get(i2));
        }
        if ((this.f31748e & 4) == 4) {
            Signature += C9831e.subscription(4, this.f31757e);
        }
        if ((this.f31748e & 8) == 8) {
            Signature += C9831e.Signature(5, this.f31753e);
        }
        if ((this.f31748e & 16) == 16) {
            Signature += C9831e.subscription(6, this.f31756e);
        }
        if ((this.f31748e & 32) == 32) {
            Signature += C9831e.Signature(7, this.f31749e);
        }
        for (int i3 = 0; i3 < this.f31754e.size(); i3++) {
            Signature += C9831e.subscription(8, (AbstractC6649e) this.f31754e.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f31747e.size(); i5++) {
            i4 += C9831e.admob(((Integer) this.f31747e.get(i5)).intValue());
        }
        int size = (this.f31747e.size() * 2) + Signature + i4;
        for (int i6 = 0; i6 < this.f31746e.size(); i6++) {
            size += C9831e.subscription(32, (AbstractC6649e) this.f31746e.get(i6));
        }
        int size2 = this.f31751e.size() + adcel() + size;
        this.f31752e = size2;
        return size2;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        C18540e c18540e = new C18540e(this);
        if ((this.f31748e & 1) == 1) {
            c9831e.m2695for(1, this.f31755e);
        }
        if ((this.f31748e & 2) == 2) {
            c9831e.m2695for(2, this.f31745e);
        }
        for (int i = 0; i < this.f31758e.size(); i++) {
            c9831e.m2704public(3, (AbstractC6649e) this.f31758e.get(i));
        }
        if ((this.f31748e & 4) == 4) {
            c9831e.m2704public(4, this.f31757e);
        }
        if ((this.f31748e & 8) == 8) {
            c9831e.m2695for(5, this.f31753e);
        }
        if ((this.f31748e & 16) == 16) {
            c9831e.m2704public(6, this.f31756e);
        }
        if ((this.f31748e & 32) == 32) {
            c9831e.m2695for(7, this.f31749e);
        }
        for (int i2 = 0; i2 < this.f31754e.size(); i2++) {
            c9831e.m2704public(8, (AbstractC6649e) this.f31754e.get(i2));
        }
        for (int i3 = 0; i3 < this.f31747e.size(); i3++) {
            c9831e.m2695for(31, ((Integer) this.f31747e.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.f31746e.size(); i4++) {
            c9831e.m2704public(32, (AbstractC6649e) this.f31746e.get(i4));
        }
        c18540e.m4583synchronized(200, c9831e);
        c9831e.m2690e(this.f31751e);
    }

    @Override // defpackage.InterfaceC8149e
    public final AbstractC6649e vip() {
        return f31744e;
    }
}
