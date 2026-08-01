package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11226e {
    public final /* synthetic */ int ad;
    public Object appmetrica;
    public int license;
    public int metrica;
    public int vip;

    public C11226e(byte b, int i) {
        this.ad = i;
        switch (i) {
            case 5:
                return;
            default:
                this.license = 7;
                this.appmetrica = new int[8];
                return;
        }
    }

    public C11226e(int i) {
        this.ad = 4;
        this.vip = i;
    }

    public /* synthetic */ C11226e(int i, Object obj) {
        this.ad = i;
        this.appmetrica = obj;
    }

    public C11226e(AbstractC3513e abstractC3513e) {
        this.ad = 3;
        this.license = 0;
        Charset charset = AbstractC2930e.ad;
        this.appmetrica = abstractC3513e;
        abstractC3513e.metrica = this;
    }

    public C11226e(AbstractC3513e abstractC3513e, byte b) {
        this.ad = 9;
        this.license = 0;
        this.appmetrica = abstractC3513e;
        abstractC3513e.metrica = this;
    }

    public C11226e(AbstractC15825e abstractC15825e) {
        this.ad = 1;
        this.license = 0;
        Charset charset = AbstractC0352e.ad;
        this.appmetrica = abstractC15825e;
        abstractC15825e.f31256e = this;
    }

    public C11226e(AbstractC15825e abstractC15825e, byte b) {
        this.ad = 2;
        this.license = 0;
        AbstractC10546e.ad(abstractC15825e, "input");
        this.appmetrica = abstractC15825e;
        abstractC15825e.f31256e = this;
    }

    public C11226e(Ctry ctry) {
        this.ad = 8;
        if (ctry == null) {
            throw new NullPointerException("treeDigest == null");
        }
        this.appmetrica = ctry;
        InterfaceC0293e ad = AbstractC7171e.ad(ctry);
        String algorithmName = ad.getAlgorithmName();
        int digestSize = algorithmName.equals("SHAKE128") ? 32 : algorithmName.equals("SHAKE256") ? 64 : ad.getDigestSize();
        this.vip = digestSize;
        int i = 16;
        this.metrica = 16;
        double d = digestSize * 8;
        int i2 = 0;
        int i3 = 16;
        int i4 = 0;
        while (true) {
            i3 >>= 1;
            if (i3 == 0) {
                break;
            } else {
                i4++;
            }
        }
        int ceil = (int) Math.ceil(d / i4);
        int i5 = 15 * ceil;
        int i6 = 0;
        while (true) {
            i5 >>= 1;
            if (i5 == 0) {
                break;
            } else {
                i6++;
            }
        }
        while (true) {
            i >>= 1;
            if (i == 0) {
                break;
            } else {
                i2++;
            }
        }
        int floor = ((int) Math.floor(i6 / i2)) + 1 + ceil;
        this.license = floor;
        String algorithmName2 = ad.getAlgorithmName();
        if (algorithmName2 == null) {
            Map map = C6452e.vip;
            throw new NullPointerException("algorithmName == null");
        }
        if (((C6452e) C6452e.vip.get(C6452e.ad(digestSize, floor, algorithmName2))) != null) {
            return;
        }
        throw new IllegalArgumentException("cannot find OID for digest algorithm: " + ad.getAlgorithmName());
    }

    /* renamed from: eَؑۨ, reason: contains not printable characters */
    public static final void m3065e(int i) {
        if ((i & 3) != 0) {
            throw new IOException("Failed to parse the message.");
        }
    }

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public static void m3066e(int i) {
        if ((i & 7) != 0) {
            throw C8868e.purchase();
        }
    }

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public static void m3067e(int i) {
        if ((i & 3) != 0) {
            throw C8868e.purchase();
        }
    }

    /* renamed from: eٍۢؒ, reason: contains not printable characters */
    public static final void m3068e(int i) {
        if ((i & 7) != 0) {
            throw new IOException("Failed to parse the message.");
        }
    }

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public static void m3069e(int i) {
        if ((i & 7) != 0) {
            throw C11872e.purchase();
        }
    }

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public static void m3070e(int i) {
        if ((i & 3) != 0) {
            throw C11872e.purchase();
        }
    }

    public void Signature(InterfaceC17042e interfaceC17042e) {
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i != 0) {
            if (i != 2) {
                throw C11690e.vip();
            }
            int vip = abstractC3513e.vip() + abstractC3513e.tapsense();
            do {
                ((C2423e) interfaceC17042e).add(Boolean.valueOf(abstractC3513e.purchase()));
            } while (abstractC3513e.vip() < vip);
            m3109for(vip);
            return;
        }
        do {
            ((C2423e) interfaceC17042e).add(Boolean.valueOf(abstractC3513e.purchase()));
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    /* renamed from: abstract, reason: not valid java name */
    public void m3071abstract(InterfaceC16489e interfaceC16489e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC16489e instanceof AbstractC11266e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C8868e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC16489e.add(Long.valueOf(abstractC15825e.premium()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC16489e.add(Long.valueOf(abstractC15825e.premium()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC11266e abstractC11266e = (AbstractC11266e) interfaceC16489e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C8868e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                abstractC11266e.billing(abstractC15825e.premium());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            abstractC11266e.billing(abstractC15825e.premium());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    public void ad(C3311e c3311e) {
        c3311e.f7471e = null;
        c3311e.f7476e = null;
        c3311e.f7472e = null;
        c3311e.f7475e = 1;
        int i = this.vip;
        if (i > 0) {
            int i2 = this.license;
            if ((i2 & 1) == 0) {
                this.license = i2 + 1;
                this.vip = i - 1;
                this.metrica++;
            }
        }
        c3311e.f7476e = (C3311e) this.appmetrica;
        this.appmetrica = c3311e;
        int i3 = this.license;
        int i4 = i3 + 1;
        this.license = i4;
        int i5 = this.vip;
        if (i5 > 0 && (i4 & 1) == 0) {
            this.license = i3 + 2;
            this.vip = i5 - 1;
            this.metrica++;
        }
        int i6 = 4;
        while (true) {
            int i7 = i6 - 1;
            if ((this.license & i7) != i7) {
                return;
            }
            int i8 = this.metrica;
            if (i8 == 0) {
                C3311e c3311e2 = (C3311e) this.appmetrica;
                C3311e c3311e3 = c3311e2.f7476e;
                C3311e c3311e4 = c3311e3.f7476e;
                c3311e3.f7476e = c3311e4.f7476e;
                this.appmetrica = c3311e3;
                c3311e3.f7472e = c3311e4;
                c3311e3.f7471e = c3311e2;
                c3311e3.f7475e = c3311e2.f7475e + 1;
                c3311e4.f7476e = c3311e3;
                c3311e2.f7476e = c3311e3;
            } else if (i8 == 1) {
                C3311e c3311e5 = (C3311e) this.appmetrica;
                C3311e c3311e6 = c3311e5.f7476e;
                this.appmetrica = c3311e6;
                c3311e6.f7471e = c3311e5;
                c3311e6.f7475e = c3311e5.f7475e + 1;
                c3311e5.f7476e = c3311e6;
                this.metrica = 0;
            } else if (i8 == 2) {
                this.metrica = 0;
            }
            i6 *= 2;
        }
    }

    public void adcel(Object obj, InterfaceC11969e interfaceC11969e, C3758e c3758e) {
        int i = this.metrica;
        this.metrica = ((this.vip >>> 3) << 3) | 4;
        try {
            interfaceC11969e.startapp(obj, this, c3758e);
            if (this.vip == this.metrica) {
            } else {
                throw new IOException("Failed to parse the message.");
            }
        } finally {
            this.metrica = i;
        }
    }

    public C6283e admob() {
        m3077continue(2);
        return ((AbstractC3513e) this.appmetrica).billing();
    }

    public void ads(InterfaceC16489e interfaceC16489e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC16489e instanceof AbstractC14936e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C8868e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC16489e.add(Integer.valueOf(abstractC15825e.isVip()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC16489e.add(Integer.valueOf(abstractC15825e.isVip()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) interfaceC16489e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C8868e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                abstractC14936e.billing(abstractC15825e.isVip());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            abstractC14936e.billing(abstractC15825e.isVip());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    public void advert(Object obj, InterfaceC11115e interfaceC11115e, C5712e c5712e) {
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        int mo589native = abstractC15825e.mo589native();
        if (abstractC15825e.f31257e + 0 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int subscription = abstractC15825e.subscription(mo589native);
        abstractC15825e.f31257e++;
        interfaceC11115e.purchase(obj, this, c5712e);
        abstractC15825e.vip(0);
        abstractC15825e.f31257e--;
        abstractC15825e.Signature(subscription);
    }

    public void amazon(InterfaceC4115e interfaceC4115e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC4115e instanceof AbstractC4963e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C11872e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC4115e.add(Boolean.valueOf(abstractC15825e.remoteconfig()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC4115e.add(Boolean.valueOf(abstractC15825e.remoteconfig()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC4963e abstractC4963e = (AbstractC4963e) interfaceC4115e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C11872e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                abstractC4963e.billing(abstractC15825e.remoteconfig());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            abstractC4963e.billing(abstractC15825e.remoteconfig());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    public void applovin(InterfaceC4115e interfaceC4115e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC4115e instanceof C4178e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C11872e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC4115e.add(Integer.valueOf(abstractC15825e.isVip()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC4115e.add(Integer.valueOf(abstractC15825e.isVip()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        C4178e c4178e = (C4178e) interfaceC4115e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C11872e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                c4178e.billing(abstractC15825e.isVip());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            c4178e.billing(abstractC15825e.isVip());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    public int appmetrica() {
        switch (this.ad) {
            case 1:
                int i = this.license;
                if (i != 0) {
                    this.vip = i;
                    this.license = 0;
                } else {
                    this.vip = ((AbstractC15825e) this.appmetrica).mo594this();
                }
                int i2 = this.vip;
                return (i2 == 0 || i2 == this.metrica) ? Alert.DURATION_SHOW_INDEFINITELY : i2 >>> 3;
            case 2:
                int i3 = this.license;
                if (i3 != 0) {
                    this.vip = i3;
                    this.license = 0;
                } else {
                    this.vip = ((AbstractC15825e) this.appmetrica).mo594this();
                }
                int i4 = this.vip;
                return (i4 == 0 || i4 == this.metrica) ? Alert.DURATION_SHOW_INDEFINITELY : i4 >>> 3;
            default:
                int i5 = this.license;
                if (i5 != 0) {
                    this.vip = i5;
                    this.license = 0;
                } else {
                    this.vip = ((AbstractC3513e) this.appmetrica).signatures();
                }
                int i6 = this.vip;
                return (i6 == 0 || i6 == this.metrica) ? Alert.DURATION_SHOW_INDEFINITELY : i6 >>> 3;
        }
    }

    public Object billing(int i) {
        return ((C12021e) this.appmetrica).startapp[this.license + i];
    }

    /* renamed from: break, reason: not valid java name */
    public void m3072break(InterfaceC4115e interfaceC4115e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC4115e instanceof AbstractC8400e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C11872e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC4115e.add(Long.valueOf(abstractC15825e.premium()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC4115e.add(Long.valueOf(abstractC15825e.premium()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC8400e abstractC8400e = (AbstractC8400e) interfaceC4115e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C11872e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                abstractC8400e.billing(abstractC15825e.premium());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            abstractC8400e.billing(abstractC15825e.premium());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    /* renamed from: case, reason: not valid java name */
    public void m3073case(InterfaceC16489e interfaceC16489e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC16489e instanceof AbstractC14936e)) {
            int i = this.vip & 7;
            if (i == 2) {
                int mo589native = abstractC15825e.mo589native();
                m3067e(mo589native);
                int yandex = abstractC15825e.yandex() + mo589native;
                do {
                    interfaceC16489e.add(Integer.valueOf(abstractC15825e.subs()));
                } while (abstractC15825e.yandex() < yandex);
                return;
            }
            if (i != 5) {
                throw C8868e.metrica();
            }
            do {
                interfaceC16489e.add(Integer.valueOf(abstractC15825e.subs()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) interfaceC16489e;
        int i2 = this.vip & 7;
        if (i2 == 2) {
            int mo589native2 = abstractC15825e.mo589native();
            m3067e(mo589native2);
            int yandex2 = abstractC15825e.yandex() + mo589native2;
            do {
                abstractC14936e.billing(abstractC15825e.subs());
            } while (abstractC15825e.yandex() < yandex2);
            return;
        }
        if (i2 != 5) {
            throw C8868e.metrica();
        }
        do {
            abstractC14936e.billing(abstractC15825e.subs());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    /* renamed from: catch, reason: not valid java name */
    public void m3074catch(InterfaceC17042e interfaceC17042e) {
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i == 2) {
            int tapsense = abstractC3513e.tapsense();
            if ((tapsense & 3) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int vip = abstractC3513e.vip() + tapsense;
            do {
                ((C2423e) interfaceC17042e).add(Integer.valueOf(abstractC3513e.loadAd()));
            } while (abstractC3513e.vip() < vip);
            return;
        }
        if (i != 5) {
            throw C11690e.vip();
        }
        do {
            ((C2423e) interfaceC17042e).add(Integer.valueOf(abstractC3513e.loadAd()));
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    /* renamed from: class, reason: not valid java name */
    public void m3075class(InterfaceC17042e interfaceC17042e) {
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i == 2) {
            int tapsense = abstractC3513e.tapsense();
            if ((tapsense & 3) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int vip = abstractC3513e.vip() + tapsense;
            do {
                ((C2423e) interfaceC17042e).add(Integer.valueOf(abstractC3513e.adcel()));
            } while (abstractC3513e.vip() < vip);
            return;
        }
        if (i != 5) {
            throw C11690e.vip();
        }
        do {
            ((C2423e) interfaceC17042e).add(Integer.valueOf(abstractC3513e.adcel()));
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    /* renamed from: const, reason: not valid java name */
    public void m3076const(InterfaceC16489e interfaceC16489e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC16489e instanceof AbstractC11266e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C8868e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC16489e.add(Long.valueOf(abstractC15825e.mo595throw()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC16489e.add(Long.valueOf(abstractC15825e.mo595throw()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC11266e abstractC11266e = (AbstractC11266e) interfaceC16489e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C8868e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                abstractC11266e.billing(abstractC15825e.mo595throw());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            abstractC11266e.billing(abstractC15825e.mo595throw());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    /* renamed from: continue, reason: not valid java name */
    public void m3077continue(int i) {
        switch (this.ad) {
            case 1:
                if ((this.vip & 7) != i) {
                    throw C11872e.metrica();
                }
                return;
            case 2:
                if ((this.vip & 7) != i) {
                    throw C8868e.metrica();
                }
                return;
            default:
                if ((this.vip & 7) != i) {
                    throw C11690e.vip();
                }
                return;
        }
    }

    public void crashlytics(InterfaceC4115e interfaceC4115e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC4115e instanceof C4178e)) {
            int i = this.vip & 7;
            if (i == 2) {
                int mo589native = abstractC15825e.mo589native();
                m3070e(mo589native);
                int yandex = abstractC15825e.yandex() + mo589native;
                do {
                    interfaceC4115e.add(Integer.valueOf(abstractC15825e.inmobi()));
                } while (abstractC15825e.yandex() < yandex);
                return;
            }
            if (i != 5) {
                throw C11872e.metrica();
            }
            do {
                interfaceC4115e.add(Integer.valueOf(abstractC15825e.inmobi()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        C4178e c4178e = (C4178e) interfaceC4115e;
        int i2 = this.vip & 7;
        if (i2 == 2) {
            int mo589native2 = abstractC15825e.mo589native();
            m3070e(mo589native2);
            int yandex2 = abstractC15825e.yandex() + mo589native2;
            do {
                c4178e.billing(abstractC15825e.inmobi());
            } while (abstractC15825e.yandex() < yandex2);
            return;
        }
        if (i2 != 5) {
            throw C11872e.metrica();
        }
        do {
            c4178e.billing(abstractC15825e.inmobi());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    /* renamed from: default, reason: not valid java name */
    public void m3078default(InterfaceC17042e interfaceC17042e) {
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i != 0) {
            if (i != 2) {
                throw C11690e.vip();
            }
            int vip = abstractC3513e.vip() + abstractC3513e.tapsense();
            do {
                ((C2423e) interfaceC17042e).add(Long.valueOf(abstractC3513e.amazon()));
            } while (abstractC3513e.vip() < vip);
            m3109for(vip);
            return;
        }
        do {
            ((C2423e) interfaceC17042e).add(Long.valueOf(abstractC3513e.amazon()));
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    /* renamed from: else, reason: not valid java name */
    public void m3079else(InterfaceC4115e interfaceC4115e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC4115e instanceof C4178e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C11872e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC4115e.add(Integer.valueOf(abstractC15825e.mo589native()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC4115e.add(Integer.valueOf(abstractC15825e.mo589native()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        C4178e c4178e = (C4178e) interfaceC4115e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C11872e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                c4178e.billing(abstractC15825e.mo589native());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            c4178e.billing(abstractC15825e.mo589native());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    /* renamed from: extends, reason: not valid java name */
    public void m3080extends(InterfaceC16489e interfaceC16489e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC16489e instanceof AbstractC8435e)) {
            int i = this.vip & 7;
            if (i == 2) {
                int mo589native = abstractC15825e.mo589native();
                m3067e(mo589native);
                int yandex = abstractC15825e.yandex() + mo589native;
                do {
                    interfaceC16489e.add(Float.valueOf(abstractC15825e.applovin()));
                } while (abstractC15825e.yandex() < yandex);
                return;
            }
            if (i != 5) {
                throw C8868e.metrica();
            }
            do {
                interfaceC16489e.add(Float.valueOf(abstractC15825e.applovin()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC8435e abstractC8435e = (AbstractC8435e) interfaceC16489e;
        int i2 = this.vip & 7;
        if (i2 == 2) {
            int mo589native2 = abstractC15825e.mo589native();
            m3067e(mo589native2);
            int yandex2 = abstractC15825e.yandex() + mo589native2;
            do {
                abstractC8435e.billing(abstractC15825e.applovin());
            } while (abstractC15825e.yandex() < yandex2);
            return;
        }
        if (i2 != 5) {
            throw C8868e.metrica();
        }
        do {
            abstractC8435e.billing(abstractC15825e.applovin());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public void m3081e(InterfaceC13229e interfaceC13229e) {
        int mo630extends;
        int i;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        if (interfaceC13229e instanceof C0878e) {
            C0878e c0878e = (C0878e) interfaceC13229e;
            int i2 = this.vip & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new C15259e();
                }
                int crashlytics = abstractC3513e.crashlytics() + abstractC3513e.mo639private();
                do {
                    c0878e.startapp(abstractC3513e.mo621abstract());
                } while (abstractC3513e.crashlytics() < crashlytics);
                m3104e(crashlytics);
                return;
            }
            do {
                c0878e.startapp(abstractC3513e.mo621abstract());
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    i = abstractC3513e.mo630extends();
                }
            } while (i == this.vip);
        } else {
            int i3 = this.vip & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new C15259e();
                }
                int crashlytics2 = abstractC3513e.crashlytics() + abstractC3513e.mo639private();
                do {
                    interfaceC13229e.add(Long.valueOf(abstractC3513e.mo621abstract()));
                } while (abstractC3513e.crashlytics() < crashlytics2);
                m3104e(crashlytics2);
                return;
            }
            do {
                interfaceC13229e.add(Long.valueOf(abstractC3513e.mo621abstract()));
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    mo630extends = abstractC3513e.mo630extends();
                }
            } while (mo630extends == this.vip);
            i = mo630extends;
        }
        this.license = i;
    }

    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    public void m3082e(InterfaceC13229e interfaceC13229e) {
        int mo630extends;
        int i;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        if (interfaceC13229e instanceof C5407e) {
            C5407e c5407e = (C5407e) interfaceC13229e;
            int i2 = this.vip & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new C15259e();
                }
                int crashlytics = abstractC3513e.crashlytics() + abstractC3513e.mo639private();
                do {
                    c5407e.startapp(abstractC3513e.mo636instanceof());
                } while (abstractC3513e.crashlytics() < crashlytics);
                m3104e(crashlytics);
                return;
            }
            do {
                c5407e.startapp(abstractC3513e.mo636instanceof());
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    i = abstractC3513e.mo630extends();
                }
            } while (i == this.vip);
        } else {
            int i3 = this.vip & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new C15259e();
                }
                int crashlytics2 = abstractC3513e.crashlytics() + abstractC3513e.mo639private();
                do {
                    interfaceC13229e.add(Integer.valueOf(abstractC3513e.mo636instanceof()));
                } while (abstractC3513e.crashlytics() < crashlytics2);
                m3104e(crashlytics2);
                return;
            }
            do {
                interfaceC13229e.add(Integer.valueOf(abstractC3513e.mo636instanceof()));
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    mo630extends = abstractC3513e.mo630extends();
                }
            } while (mo630extends == this.vip);
            i = mo630extends;
        }
        this.license = i;
    }

    /* renamed from: eؒۖۗ, reason: contains not printable characters */
    public void m3083e(InterfaceC13229e interfaceC13229e) {
        int mo630extends;
        int i;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        if (interfaceC13229e instanceof C5407e) {
            C5407e c5407e = (C5407e) interfaceC13229e;
            int i2 = this.vip & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new C15259e();
                }
                int crashlytics = abstractC3513e.crashlytics() + abstractC3513e.mo639private();
                do {
                    c5407e.startapp(abstractC3513e.mo639private());
                } while (abstractC3513e.crashlytics() < crashlytics);
                m3104e(crashlytics);
                return;
            }
            do {
                c5407e.startapp(abstractC3513e.mo639private());
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    i = abstractC3513e.mo630extends();
                }
            } while (i == this.vip);
        } else {
            int i3 = this.vip & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new C15259e();
                }
                int crashlytics2 = abstractC3513e.crashlytics() + abstractC3513e.mo639private();
                do {
                    interfaceC13229e.add(Integer.valueOf(abstractC3513e.mo639private()));
                } while (abstractC3513e.crashlytics() < crashlytics2);
                m3104e(crashlytics2);
                return;
            }
            do {
                interfaceC13229e.add(Integer.valueOf(abstractC3513e.mo639private()));
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    mo630extends = abstractC3513e.mo630extends();
                }
            } while (mo630extends == this.vip);
            i = mo630extends;
        }
        this.license = i;
    }

    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public void m3084e(InterfaceC13229e interfaceC13229e) {
        int mo630extends;
        int i;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        if (interfaceC13229e instanceof C5407e) {
            C5407e c5407e = (C5407e) interfaceC13229e;
            int i2 = this.vip & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new C15259e();
                }
                int crashlytics = abstractC3513e.crashlytics() + abstractC3513e.mo639private();
                do {
                    c5407e.startapp(abstractC3513e.mo628default());
                } while (abstractC3513e.crashlytics() < crashlytics);
                m3104e(crashlytics);
                return;
            }
            do {
                c5407e.startapp(abstractC3513e.mo628default());
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    i = abstractC3513e.mo630extends();
                }
            } while (i == this.vip);
        } else {
            int i3 = this.vip & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new C15259e();
                }
                int crashlytics2 = abstractC3513e.crashlytics() + abstractC3513e.mo639private();
                do {
                    interfaceC13229e.add(Integer.valueOf(abstractC3513e.mo628default()));
                } while (abstractC3513e.crashlytics() < crashlytics2);
                m3104e(crashlytics2);
                return;
            }
            do {
                interfaceC13229e.add(Integer.valueOf(abstractC3513e.mo628default()));
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    mo630extends = abstractC3513e.mo630extends();
                }
            } while (mo630extends == this.vip);
            i = mo630extends;
        }
        this.license = i;
    }

    /* renamed from: eٍؖۙ, reason: contains not printable characters */
    public void m3085e(InterfaceC13229e interfaceC13229e) {
        int mo630extends;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i == 2) {
            int mo639private = abstractC3513e.mo639private();
            m3065e(mo639private);
            int crashlytics = abstractC3513e.crashlytics() + mo639private;
            do {
                interfaceC13229e.add(Float.valueOf(abstractC3513e.mo640protected()));
            } while (abstractC3513e.crashlytics() < crashlytics);
            return;
        }
        if (i != 5) {
            throw new C15259e();
        }
        do {
            interfaceC13229e.add(Float.valueOf(abstractC3513e.mo640protected()));
            if (abstractC3513e.subs()) {
                return;
            } else {
                mo630extends = abstractC3513e.mo630extends();
            }
        } while (mo630extends == this.vip);
        this.license = mo630extends;
    }

    /* renamed from: eٌؖۡ, reason: contains not printable characters */
    public void m3086e(InterfaceC13229e interfaceC13229e) {
        int mo630extends;
        int i;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        if (interfaceC13229e instanceof C5407e) {
            C5407e c5407e = (C5407e) interfaceC13229e;
            int i2 = this.vip & 7;
            if (i2 == 2) {
                int mo639private = abstractC3513e.mo639private();
                m3065e(mo639private);
                int crashlytics = abstractC3513e.crashlytics() + mo639private;
                do {
                    c5407e.startapp(abstractC3513e.mo623case());
                } while (abstractC3513e.crashlytics() < crashlytics);
                return;
            }
            if (i2 != 5) {
                throw new C15259e();
            }
            do {
                c5407e.startapp(abstractC3513e.mo623case());
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    i = abstractC3513e.mo630extends();
                }
            } while (i == this.vip);
        } else {
            int i3 = this.vip & 7;
            if (i3 == 2) {
                int mo639private2 = abstractC3513e.mo639private();
                m3065e(mo639private2);
                int crashlytics2 = abstractC3513e.crashlytics() + mo639private2;
                do {
                    interfaceC13229e.add(Integer.valueOf(abstractC3513e.mo623case()));
                } while (abstractC3513e.crashlytics() < crashlytics2);
                return;
            }
            if (i3 != 5) {
                throw new C15259e();
            }
            do {
                interfaceC13229e.add(Integer.valueOf(abstractC3513e.mo623case()));
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    mo630extends = abstractC3513e.mo630extends();
                }
            } while (mo630extends == this.vip);
            i = mo630extends;
        }
        this.license = i;
    }

    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public void m3087e(InterfaceC13229e interfaceC13229e, InterfaceC16984e interfaceC16984e, C17268e c17268e) {
        int mo630extends;
        int i = this.vip;
        if ((i & 7) != 2) {
            throw new C15259e();
        }
        do {
            AbstractC15319e ad = interfaceC16984e.ad();
            m3106e(ad, interfaceC16984e, c17268e);
            interfaceC16984e.metrica(ad);
            interfaceC13229e.add(ad);
            AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
            if (abstractC3513e.subs() || this.license != 0) {
                return;
            } else {
                mo630extends = abstractC3513e.mo630extends();
            }
        } while (mo630extends == i);
        this.license = mo630extends;
    }

    /* renamed from: eؘُٔ, reason: contains not printable characters */
    public void m3088e(InterfaceC13229e interfaceC13229e, InterfaceC16984e interfaceC16984e, C17268e c17268e) {
        int mo630extends;
        int i = this.vip;
        if ((i & 7) != 3) {
            throw new C15259e();
        }
        do {
            AbstractC15319e ad = interfaceC16984e.ad();
            m3094e(ad, interfaceC16984e, c17268e);
            interfaceC16984e.metrica(ad);
            interfaceC13229e.add(ad);
            AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
            if (abstractC3513e.subs() || this.license != 0) {
                return;
            } else {
                mo630extends = abstractC3513e.mo630extends();
            }
        } while (mo630extends == i);
        this.license = mo630extends;
    }

    /* renamed from: eؘٕۚ, reason: contains not printable characters */
    public void m3089e(int i) {
        if ((this.vip & 7) != i) {
            throw new C15259e();
        }
    }

    /* renamed from: eؚؚؓ, reason: contains not printable characters */
    public void m3090e(InterfaceC13229e interfaceC13229e) {
        int mo630extends;
        int i;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        if (interfaceC13229e instanceof C0878e) {
            C0878e c0878e = (C0878e) interfaceC13229e;
            int i2 = this.vip & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new C15259e();
                }
                int crashlytics = abstractC3513e.crashlytics() + abstractC3513e.mo639private();
                do {
                    c0878e.startapp(abstractC3513e.mo643static());
                } while (abstractC3513e.crashlytics() < crashlytics);
                m3104e(crashlytics);
                return;
            }
            do {
                c0878e.startapp(abstractC3513e.mo643static());
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    i = abstractC3513e.mo630extends();
                }
            } while (i == this.vip);
        } else {
            int i3 = this.vip & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new C15259e();
                }
                int crashlytics2 = abstractC3513e.crashlytics() + abstractC3513e.mo639private();
                do {
                    interfaceC13229e.add(Long.valueOf(abstractC3513e.mo643static()));
                } while (abstractC3513e.crashlytics() < crashlytics2);
                m3104e(crashlytics2);
                return;
            }
            do {
                interfaceC13229e.add(Long.valueOf(abstractC3513e.mo643static()));
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    mo630extends = abstractC3513e.mo630extends();
                }
            } while (mo630extends == this.vip);
            i = mo630extends;
        }
        this.license = i;
    }

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public void m3091e(InterfaceC13229e interfaceC13229e) {
        int mo630extends;
        int i;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        if (interfaceC13229e instanceof C5407e) {
            C5407e c5407e = (C5407e) interfaceC13229e;
            int i2 = this.vip & 7;
            if (i2 == 2) {
                int mo639private = abstractC3513e.mo639private();
                m3065e(mo639private);
                int crashlytics = abstractC3513e.crashlytics() + mo639private;
                do {
                    c5407e.startapp(abstractC3513e.mo650transient());
                } while (abstractC3513e.crashlytics() < crashlytics);
                return;
            }
            if (i2 != 5) {
                throw new C15259e();
            }
            do {
                c5407e.startapp(abstractC3513e.mo650transient());
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    i = abstractC3513e.mo630extends();
                }
            } while (i == this.vip);
        } else {
            int i3 = this.vip & 7;
            if (i3 == 2) {
                int mo639private2 = abstractC3513e.mo639private();
                m3065e(mo639private2);
                int crashlytics2 = abstractC3513e.crashlytics() + mo639private2;
                do {
                    interfaceC13229e.add(Integer.valueOf(abstractC3513e.mo650transient()));
                } while (abstractC3513e.crashlytics() < crashlytics2);
                return;
            }
            if (i3 != 5) {
                throw new C15259e();
            }
            do {
                interfaceC13229e.add(Integer.valueOf(abstractC3513e.mo650transient()));
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    mo630extends = abstractC3513e.mo630extends();
                }
            } while (mo630extends == this.vip);
            i = mo630extends;
        }
        this.license = i;
    }

    /* renamed from: eَٖٓ, reason: contains not printable characters */
    public void m3092e(InterfaceC13229e interfaceC13229e) {
        int mo630extends;
        int i;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        if (interfaceC13229e instanceof C0878e) {
            C0878e c0878e = (C0878e) interfaceC13229e;
            int i2 = this.vip & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new C15259e();
                }
                int mo639private = abstractC3513e.mo639private();
                m3068e(mo639private);
                int crashlytics = abstractC3513e.crashlytics() + mo639private;
                do {
                    c0878e.startapp(abstractC3513e.mo635import());
                } while (abstractC3513e.crashlytics() < crashlytics);
                return;
            }
            do {
                c0878e.startapp(abstractC3513e.mo635import());
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    i = abstractC3513e.mo630extends();
                }
            } while (i == this.vip);
        } else {
            int i3 = this.vip & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new C15259e();
                }
                int mo639private2 = abstractC3513e.mo639private();
                m3068e(mo639private2);
                int crashlytics2 = abstractC3513e.crashlytics() + mo639private2;
                do {
                    interfaceC13229e.add(Long.valueOf(abstractC3513e.mo635import()));
                } while (abstractC3513e.crashlytics() < crashlytics2);
                return;
            }
            do {
                interfaceC13229e.add(Long.valueOf(abstractC3513e.mo635import()));
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    mo630extends = abstractC3513e.mo630extends();
                }
            } while (mo630extends == this.vip);
            i = mo630extends;
        }
        this.license = i;
    }

    /* renamed from: eُٓؓ, reason: contains not printable characters */
    public void m3093e(InterfaceC13229e interfaceC13229e) {
        int mo630extends;
        int i;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        if (interfaceC13229e instanceof C0878e) {
            C0878e c0878e = (C0878e) interfaceC13229e;
            int i2 = this.vip & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new C15259e();
                }
                int mo639private = abstractC3513e.mo639private();
                m3068e(mo639private);
                int crashlytics = abstractC3513e.crashlytics() + mo639private;
                do {
                    c0878e.startapp(abstractC3513e.mo634implements());
                } while (abstractC3513e.crashlytics() < crashlytics);
                return;
            }
            do {
                c0878e.startapp(abstractC3513e.mo634implements());
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    i = abstractC3513e.mo630extends();
                }
            } while (i == this.vip);
        } else {
            int i3 = this.vip & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new C15259e();
                }
                int mo639private2 = abstractC3513e.mo639private();
                m3068e(mo639private2);
                int crashlytics2 = abstractC3513e.crashlytics() + mo639private2;
                do {
                    interfaceC13229e.add(Long.valueOf(abstractC3513e.mo634implements()));
                } while (abstractC3513e.crashlytics() < crashlytics2);
                return;
            }
            do {
                interfaceC13229e.add(Long.valueOf(abstractC3513e.mo634implements()));
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    mo630extends = abstractC3513e.mo630extends();
                }
            } while (mo630extends == this.vip);
            i = mo630extends;
        }
        this.license = i;
    }

    /* renamed from: eُۘٙ, reason: contains not printable characters */
    public void m3094e(Object obj, InterfaceC16984e interfaceC16984e, C17268e c17268e) {
        int i = this.metrica;
        this.metrica = ((this.vip >>> 3) << 3) | 4;
        try {
            interfaceC16984e.adcel(obj, this, c17268e);
            if (this.vip == this.metrica) {
            } else {
                throw new IOException("Failed to parse the message.");
            }
        } finally {
            this.metrica = i;
        }
    }

    /* renamed from: eِؗؓ, reason: contains not printable characters */
    public void m3095e(InterfaceC13229e interfaceC13229e) {
        int mo630extends;
        int i;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        if (interfaceC13229e instanceof C5407e) {
            C5407e c5407e = (C5407e) interfaceC13229e;
            int i2 = this.vip & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new C15259e();
                }
                int crashlytics = abstractC3513e.crashlytics() + abstractC3513e.mo639private();
                do {
                    c5407e.startapp(abstractC3513e.mo638package());
                } while (abstractC3513e.crashlytics() < crashlytics);
                m3104e(crashlytics);
                return;
            }
            do {
                c5407e.startapp(abstractC3513e.mo638package());
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    i = abstractC3513e.mo630extends();
                }
            } while (i == this.vip);
        } else {
            int i3 = this.vip & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new C15259e();
                }
                int crashlytics2 = abstractC3513e.crashlytics() + abstractC3513e.mo639private();
                do {
                    interfaceC13229e.add(Integer.valueOf(abstractC3513e.mo638package()));
                } while (abstractC3513e.crashlytics() < crashlytics2);
                m3104e(crashlytics2);
                return;
            }
            do {
                interfaceC13229e.add(Integer.valueOf(abstractC3513e.mo638package()));
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    mo630extends = abstractC3513e.mo630extends();
                }
            } while (mo630extends == this.vip);
            i = mo630extends;
        }
        this.license = i;
    }

    /* renamed from: eؙِۡ, reason: contains not printable characters */
    public AbstractC7244e m3096e() {
        m3089e(2);
        return ((AbstractC3513e) this.appmetrica).mo637new();
    }

    /* renamed from: eّْٝ, reason: contains not printable characters */
    public Object m3097e(EnumC11345e enumC11345e, Class cls, C17268e c17268e) {
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        EnumC11345e enumC11345e2 = EnumC11345e.f22820e;
        switch (enumC11345e.ordinal()) {
            case 0:
                m3089e(1);
                return Double.valueOf(abstractC3513e.mo651try());
            case 1:
                m3089e(5);
                return Float.valueOf(abstractC3513e.mo640protected());
            case 2:
                m3089e(0);
                return Long.valueOf(abstractC3513e.mo621abstract());
            case 3:
                m3089e(0);
                return Long.valueOf(abstractC3513e.mo622break());
            case 4:
                m3089e(0);
                return Integer.valueOf(abstractC3513e.mo628default());
            case 5:
                m3089e(1);
                return Long.valueOf(abstractC3513e.mo634implements());
            case 6:
                m3089e(5);
                return Integer.valueOf(abstractC3513e.mo623case());
            case 7:
                m3089e(0);
                return Boolean.valueOf(abstractC3513e.mo624catch());
            case 8:
                m3089e(2);
                return abstractC3513e.mo645super();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                m3089e(2);
                InterfaceC16984e ad = C5913e.metrica.ad(cls);
                AbstractC15319e ad2 = ad.ad();
                m3106e(ad2, ad, c17268e);
                ad.metrica(ad2);
                return ad2;
            case 11:
                return m3096e();
            case 12:
                m3089e(0);
                return Integer.valueOf(abstractC3513e.mo639private());
            case 13:
                m3089e(0);
                return Integer.valueOf(abstractC3513e.mo638package());
            case 14:
                m3089e(5);
                return Integer.valueOf(abstractC3513e.mo650transient());
            case 15:
                m3089e(1);
                return Long.valueOf(abstractC3513e.mo635import());
            case 16:
                m3089e(0);
                return Integer.valueOf(abstractC3513e.mo636instanceof());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                m3089e(0);
                return Long.valueOf(abstractC3513e.mo643static());
        }
    }

    /* renamed from: eْۢؕ, reason: contains not printable characters */
    public void m3098e(InterfaceC13229e interfaceC13229e) {
        int mo630extends;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i != 1) {
            if (i != 2) {
                throw new C15259e();
            }
            int mo639private = abstractC3513e.mo639private();
            m3068e(mo639private);
            int crashlytics = abstractC3513e.crashlytics() + mo639private;
            do {
                interfaceC13229e.add(Double.valueOf(abstractC3513e.mo651try()));
            } while (abstractC3513e.crashlytics() < crashlytics);
            return;
        }
        do {
            interfaceC13229e.add(Double.valueOf(abstractC3513e.mo651try()));
            if (abstractC3513e.subs()) {
                return;
            } else {
                mo630extends = abstractC3513e.mo630extends();
            }
        } while (mo630extends == this.vip);
        this.license = mo630extends;
    }

    /* renamed from: eٍٓۢ, reason: contains not printable characters */
    public int m3099e() {
        int i = this.license;
        if (i != 0) {
            this.vip = i;
            this.license = 0;
        } else {
            i = ((AbstractC3513e) this.appmetrica).mo630extends();
            this.vip = i;
        }
        return (i == 0 || i == this.metrica) ? Alert.DURATION_SHOW_INDEFINITELY : i >>> 3;
    }

    /* renamed from: eٓٛۢ, reason: contains not printable characters */
    public void m3100e(InterfaceC13229e interfaceC13229e) {
        int mo630extends;
        if ((this.vip & 7) != 2) {
            throw new C15259e();
        }
        do {
            interfaceC13229e.add(m3096e());
            AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
            if (abstractC3513e.subs()) {
                return;
            } else {
                mo630extends = abstractC3513e.mo630extends();
            }
        } while (mo630extends == this.vip);
        this.license = mo630extends;
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public void m3101e(InterfaceC13229e interfaceC13229e) {
        int mo630extends;
        int i;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        if (interfaceC13229e instanceof C0878e) {
            C0878e c0878e = (C0878e) interfaceC13229e;
            int i2 = this.vip & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new C15259e();
                }
                int crashlytics = abstractC3513e.crashlytics() + abstractC3513e.mo639private();
                do {
                    c0878e.startapp(abstractC3513e.mo622break());
                } while (abstractC3513e.crashlytics() < crashlytics);
                m3104e(crashlytics);
                return;
            }
            do {
                c0878e.startapp(abstractC3513e.mo622break());
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    i = abstractC3513e.mo630extends();
                }
            } while (i == this.vip);
        } else {
            int i3 = this.vip & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new C15259e();
                }
                int crashlytics2 = abstractC3513e.crashlytics() + abstractC3513e.mo639private();
                do {
                    interfaceC13229e.add(Long.valueOf(abstractC3513e.mo622break()));
                } while (abstractC3513e.crashlytics() < crashlytics2);
                m3104e(crashlytics2);
                return;
            }
            do {
                interfaceC13229e.add(Long.valueOf(abstractC3513e.mo622break()));
                if (abstractC3513e.subs()) {
                    return;
                } else {
                    mo630extends = abstractC3513e.mo630extends();
                }
            } while (mo630extends == this.vip);
            i = mo630extends;
        }
        this.license = i;
    }

    /* renamed from: eّٔؖ, reason: contains not printable characters */
    public void m3102e(InterfaceC13229e interfaceC13229e) {
        int mo630extends;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i != 0) {
            if (i != 2) {
                throw new C15259e();
            }
            int crashlytics = abstractC3513e.crashlytics() + abstractC3513e.mo639private();
            do {
                interfaceC13229e.add(Boolean.valueOf(abstractC3513e.mo624catch()));
            } while (abstractC3513e.crashlytics() < crashlytics);
            m3104e(crashlytics);
            return;
        }
        do {
            interfaceC13229e.add(Boolean.valueOf(abstractC3513e.mo624catch()));
            if (abstractC3513e.subs()) {
                return;
            } else {
                mo630extends = abstractC3513e.mo630extends();
            }
        } while (mo630extends == this.vip);
        this.license = mo630extends;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x007e, code lost:
    
        r12.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0081, code lost:
    
        r1.ads(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0084, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042 A[SYNTHETIC] */
    /* renamed from: eٕؓٝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m3103e(defpackage.C8926e r12, defpackage.C15024e r13, defpackage.C17268e r14) {
        /*
            r11 = this;
            r0 = 2
            r11.m3089e(r0)
            java.lang.Object r1 = r11.appmetrica
            eؕٞؐ r1 = (defpackage.AbstractC3513e) r1
            int r2 = r1.mo639private()
            int r2 = r1.applovin(r2)
            java.lang.Object r3 = r13.f29789e
            java.lang.String r4 = ""
            r5 = r3
        L15:
            int r6 = r11.m3099e()     // Catch: java.lang.Throwable -> L49
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L7e
            boolean r7 = r1.subs()     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L25
            goto L7e
        L25:
            r7 = 1
            r8 = 0
            java.lang.String r9 = "Unable to parse map entry."
            if (r6 == r7) goto L5a
            if (r6 == r0) goto L4d
            boolean r6 = r1.subs()     // Catch: java.lang.Throwable -> L49 defpackage.C15259e -> L4b
            if (r6 != 0) goto L3f
            int r6 = r11.vip     // Catch: java.lang.Throwable -> L49 defpackage.C15259e -> L4b
            int r7 = r11.metrica     // Catch: java.lang.Throwable -> L49 defpackage.C15259e -> L4b
            if (r6 != r7) goto L3a
            goto L3f
        L3a:
            boolean r6 = r1.mo653while(r6)     // Catch: java.lang.Throwable -> L49 defpackage.C15259e -> L4b
            goto L40
        L3f:
            r6 = r8
        L40:
            if (r6 == 0) goto L43
            goto L15
        L43:
            eٌُٜ r6 = new eٌُٜ     // Catch: java.lang.Throwable -> L49 defpackage.C15259e -> L4b
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L49 defpackage.C15259e -> L4b
            throw r6     // Catch: java.lang.Throwable -> L49 defpackage.C15259e -> L4b
        L49:
            r12 = move-exception
            goto L85
        L4b:
            r6 = move-exception
            goto L64
        L4d:
            java.lang.Object r6 = r13.f29787e     // Catch: java.lang.Throwable -> L49 defpackage.C15259e -> L4b
            eُۢٗ r6 = (defpackage.EnumC11345e) r6     // Catch: java.lang.Throwable -> L49 defpackage.C15259e -> L4b
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L49 defpackage.C15259e -> L4b
            java.lang.Object r5 = r11.m3097e(r6, r7, r14)     // Catch: java.lang.Throwable -> L49 defpackage.C15259e -> L4b
            goto L15
        L5a:
            java.lang.Object r6 = r13.f29788e     // Catch: java.lang.Throwable -> L49 defpackage.C15259e -> L4b
            eُۢٗ r6 = (defpackage.EnumC11345e) r6     // Catch: java.lang.Throwable -> L49 defpackage.C15259e -> L4b
            r7 = 0
            java.lang.Object r4 = r11.m3097e(r6, r7, r7)     // Catch: java.lang.Throwable -> L49 defpackage.C15259e -> L4b
            goto L15
        L64:
            boolean r7 = r1.subs()     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L75
            int r7 = r11.vip     // Catch: java.lang.Throwable -> L49
            int r10 = r11.metrica     // Catch: java.lang.Throwable -> L49
            if (r7 != r10) goto L71
            goto L75
        L71:
            boolean r8 = r1.mo653while(r7)     // Catch: java.lang.Throwable -> L49
        L75:
            if (r8 == 0) goto L78
            goto L15
        L78:
            eٌُٜ r12 = new eٌُٜ     // Catch: java.lang.Throwable -> L49
            r12.<init>(r9, r6)     // Catch: java.lang.Throwable -> L49
            throw r12     // Catch: java.lang.Throwable -> L49
        L7e:
            r12.put(r4, r5)     // Catch: java.lang.Throwable -> L49
            r1.ads(r2)
            return
        L85:
            r1.ads(r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11226e.m3103e(eٌۘؕ, eُٔۡ, eٗۛۤ):void");
    }

    /* renamed from: eؘٖؗ, reason: contains not printable characters */
    public void m3104e(int i) {
        if (((AbstractC3513e) this.appmetrica).crashlytics() != i) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* renamed from: eٟٗۦ, reason: contains not printable characters */
    public void m3105e(InterfaceC13229e interfaceC13229e, boolean z) {
        String mo631final;
        int mo630extends;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        if ((this.vip & 7) != 2) {
            throw new C15259e();
        }
        do {
            if (z) {
                m3089e(2);
                mo631final = abstractC3513e.mo645super();
            } else {
                m3089e(2);
                mo631final = abstractC3513e.mo631final();
            }
            interfaceC13229e.add(mo631final);
            if (abstractC3513e.subs()) {
                return;
            } else {
                mo630extends = abstractC3513e.mo630extends();
            }
        } while (mo630extends == this.vip);
        this.license = mo630extends;
    }

    /* renamed from: e٘ٔ٘, reason: contains not printable characters */
    public void m3106e(Object obj, InterfaceC16984e interfaceC16984e, C17268e c17268e) {
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int mo639private = abstractC3513e.mo639private();
        if (abstractC3513e.ad + abstractC3513e.vip >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int applovin = abstractC3513e.applovin(mo639private);
        abstractC3513e.ad++;
        interfaceC16984e.adcel(obj, this, c17268e);
        abstractC3513e.mo648throw(0);
        abstractC3513e.ad--;
        abstractC3513e.ads(applovin);
    }

    /* renamed from: final, reason: not valid java name */
    public void m3107final(InterfaceC4115e interfaceC4115e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC4115e instanceof AbstractC8400e)) {
            int i = this.vip & 7;
            if (i != 1) {
                if (i != 2) {
                    throw C11872e.metrica();
                }
                int mo589native = abstractC15825e.mo589native();
                m3069e(mo589native);
                int yandex = abstractC15825e.yandex() + mo589native;
                do {
                    interfaceC4115e.add(Long.valueOf(abstractC15825e.crashlytics()));
                } while (abstractC15825e.yandex() < yandex);
                return;
            }
            do {
                interfaceC4115e.add(Long.valueOf(abstractC15825e.crashlytics()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC8400e abstractC8400e = (AbstractC8400e) interfaceC4115e;
        int i2 = this.vip & 7;
        if (i2 != 1) {
            if (i2 != 2) {
                throw C11872e.metrica();
            }
            int mo589native2 = abstractC15825e.mo589native();
            m3069e(mo589native2);
            int yandex2 = abstractC15825e.yandex() + mo589native2;
            do {
                abstractC8400e.billing(abstractC15825e.crashlytics());
            } while (abstractC15825e.yandex() < yandex2);
            return;
        }
        do {
            abstractC8400e.billing(abstractC15825e.crashlytics());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    /* renamed from: finally, reason: not valid java name */
    public void m3108finally(InterfaceC4115e interfaceC4115e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC4115e instanceof AbstractC8400e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C11872e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC4115e.add(Long.valueOf(abstractC15825e.mo595throw()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC4115e.add(Long.valueOf(abstractC15825e.mo595throw()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC8400e abstractC8400e = (AbstractC8400e) interfaceC4115e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C11872e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                abstractC8400e.billing(abstractC15825e.mo595throw());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            abstractC8400e.billing(abstractC15825e.mo595throw());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    public void firebase(InterfaceC16489e interfaceC16489e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC16489e instanceof AbstractC14936e)) {
            int i = this.vip & 7;
            if (i == 2) {
                int mo589native = abstractC15825e.mo589native();
                m3067e(mo589native);
                int yandex = abstractC15825e.yandex() + mo589native;
                do {
                    interfaceC16489e.add(Integer.valueOf(abstractC15825e.inmobi()));
                } while (abstractC15825e.yandex() < yandex);
                return;
            }
            if (i != 5) {
                throw C8868e.metrica();
            }
            do {
                interfaceC16489e.add(Integer.valueOf(abstractC15825e.inmobi()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) interfaceC16489e;
        int i2 = this.vip & 7;
        if (i2 == 2) {
            int mo589native2 = abstractC15825e.mo589native();
            m3067e(mo589native2);
            int yandex2 = abstractC15825e.yandex() + mo589native2;
            do {
                abstractC14936e.billing(abstractC15825e.inmobi());
            } while (abstractC15825e.yandex() < yandex2);
            return;
        }
        if (i2 != 5) {
            throw C8868e.metrica();
        }
        do {
            abstractC14936e.billing(abstractC15825e.inmobi());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    /* renamed from: for, reason: not valid java name */
    public void m3109for(int i) {
        switch (this.ad) {
            case 1:
                if (((AbstractC15825e) this.appmetrica).yandex() != i) {
                    throw C11872e.billing();
                }
                return;
            case 2:
                if (((AbstractC15825e) this.appmetrica).yandex() != i) {
                    throw C8868e.billing();
                }
                return;
            default:
                if (((AbstractC3513e) this.appmetrica).vip() != i) {
                    throw C11690e.appmetrica();
                }
                return;
        }
    }

    /* renamed from: goto, reason: not valid java name */
    public void m3110goto(InterfaceC16489e interfaceC16489e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC16489e instanceof AbstractC11266e)) {
            int i = this.vip & 7;
            if (i != 1) {
                if (i != 2) {
                    throw C8868e.metrica();
                }
                int mo589native = abstractC15825e.mo589native();
                m3066e(mo589native);
                int yandex = abstractC15825e.yandex() + mo589native;
                do {
                    interfaceC16489e.add(Long.valueOf(abstractC15825e.isPro()));
                } while (abstractC15825e.yandex() < yandex);
                return;
            }
            do {
                interfaceC16489e.add(Long.valueOf(abstractC15825e.isPro()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC11266e abstractC11266e = (AbstractC11266e) interfaceC16489e;
        int i2 = this.vip & 7;
        if (i2 != 1) {
            if (i2 != 2) {
                throw C8868e.metrica();
            }
            int mo589native2 = abstractC15825e.mo589native();
            m3066e(mo589native2);
            int yandex2 = abstractC15825e.yandex() + mo589native2;
            do {
                abstractC11266e.billing(abstractC15825e.isPro());
            } while (abstractC15825e.yandex() < yandex2);
            return;
        }
        do {
            abstractC11266e.billing(abstractC15825e.isPro());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    /* renamed from: implements, reason: not valid java name */
    public void m3111implements(InterfaceC4115e interfaceC4115e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC4115e instanceof C4178e)) {
            int i = this.vip & 7;
            if (i == 2) {
                int mo589native = abstractC15825e.mo589native();
                m3070e(mo589native);
                int yandex = abstractC15825e.yandex() + mo589native;
                do {
                    interfaceC4115e.add(Integer.valueOf(abstractC15825e.subs()));
                } while (abstractC15825e.yandex() < yandex);
                return;
            }
            if (i != 5) {
                throw C11872e.metrica();
            }
            do {
                interfaceC4115e.add(Integer.valueOf(abstractC15825e.subs()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        C4178e c4178e = (C4178e) interfaceC4115e;
        int i2 = this.vip & 7;
        if (i2 == 2) {
            int mo589native2 = abstractC15825e.mo589native();
            m3070e(mo589native2);
            int yandex2 = abstractC15825e.yandex() + mo589native2;
            do {
                c4178e.billing(abstractC15825e.subs());
            } while (abstractC15825e.yandex() < yandex2);
            return;
        }
        if (i2 != 5) {
            throw C11872e.metrica();
        }
        do {
            c4178e.billing(abstractC15825e.subs());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    /* renamed from: import, reason: not valid java name */
    public void m3112import(InterfaceC16489e interfaceC16489e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC16489e instanceof AbstractC11266e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C8868e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC16489e.add(Long.valueOf(abstractC15825e.mo583class()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC16489e.add(Long.valueOf(abstractC15825e.mo583class()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC11266e abstractC11266e = (AbstractC11266e) interfaceC16489e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C8868e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                abstractC11266e.billing(abstractC15825e.mo583class());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            abstractC11266e.billing(abstractC15825e.mo583class());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    public void inmobi(InterfaceC16489e interfaceC16489e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC16489e instanceof AbstractC6125e)) {
            int i = this.vip & 7;
            if (i != 1) {
                if (i != 2) {
                    throw C8868e.metrica();
                }
                int mo589native = abstractC15825e.mo589native();
                m3066e(mo589native);
                int yandex = abstractC15825e.yandex() + mo589native;
                do {
                    interfaceC16489e.add(Double.valueOf(abstractC15825e.tapsense()));
                } while (abstractC15825e.yandex() < yandex);
                return;
            }
            do {
                interfaceC16489e.add(Double.valueOf(abstractC15825e.tapsense()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC6125e abstractC6125e = (AbstractC6125e) interfaceC16489e;
        int i2 = this.vip & 7;
        if (i2 != 1) {
            if (i2 != 2) {
                throw C8868e.metrica();
            }
            int mo589native2 = abstractC15825e.mo589native();
            m3066e(mo589native2);
            int yandex2 = abstractC15825e.yandex() + mo589native2;
            do {
                abstractC6125e.billing(abstractC15825e.tapsense());
            } while (abstractC15825e.yandex() < yandex2);
            return;
        }
        do {
            abstractC6125e.billing(abstractC15825e.tapsense());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    /* renamed from: instanceof, reason: not valid java name */
    public void m3113instanceof(InterfaceC17042e interfaceC17042e) {
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i != 0) {
            if (i != 2) {
                throw C11690e.vip();
            }
            int vip = abstractC3513e.vip() + abstractC3513e.tapsense();
            do {
                ((C2423e) interfaceC17042e).add(Long.valueOf(abstractC3513e.subscription()));
            } while (abstractC3513e.vip() < vip);
            m3109for(vip);
            return;
        }
        do {
            ((C2423e) interfaceC17042e).add(Long.valueOf(abstractC3513e.subscription()));
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    /* renamed from: interface, reason: not valid java name */
    public void m3114interface(InterfaceC4115e interfaceC4115e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC4115e instanceof AbstractC8400e)) {
            int i = this.vip & 7;
            if (i != 1) {
                if (i != 2) {
                    throw C11872e.metrica();
                }
                int mo589native = abstractC15825e.mo589native();
                m3069e(mo589native);
                int yandex = abstractC15825e.yandex() + mo589native;
                do {
                    interfaceC4115e.add(Long.valueOf(abstractC15825e.isPro()));
                } while (abstractC15825e.yandex() < yandex);
                return;
            }
            do {
                interfaceC4115e.add(Long.valueOf(abstractC15825e.isPro()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC8400e abstractC8400e = (AbstractC8400e) interfaceC4115e;
        int i2 = this.vip & 7;
        if (i2 != 1) {
            if (i2 != 2) {
                throw C11872e.metrica();
            }
            int mo589native2 = abstractC15825e.mo589native();
            m3069e(mo589native2);
            int yandex2 = abstractC15825e.yandex() + mo589native2;
            do {
                abstractC8400e.billing(abstractC15825e.isPro());
            } while (abstractC15825e.yandex() < yandex2);
            return;
        }
        do {
            abstractC8400e.billing(abstractC15825e.isPro());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    public void isPro(InterfaceC17042e interfaceC17042e) {
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i != 1) {
            if (i != 2) {
                throw C11690e.vip();
            }
            int tapsense = abstractC3513e.tapsense();
            if ((tapsense & 7) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int vip = abstractC3513e.vip() + tapsense;
            do {
                ((C2423e) interfaceC17042e).add(Double.valueOf(abstractC3513e.yandex()));
            } while (abstractC3513e.vip() < vip);
            return;
        }
        do {
            ((C2423e) interfaceC17042e).add(Double.valueOf(abstractC3513e.yandex()));
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    public void isVip(InterfaceC4115e interfaceC4115e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC4115e instanceof AbstractC7986e)) {
            int i = this.vip & 7;
            if (i != 1) {
                if (i != 2) {
                    throw C11872e.metrica();
                }
                int mo589native = abstractC15825e.mo589native();
                m3069e(mo589native);
                int yandex = abstractC15825e.yandex() + mo589native;
                do {
                    interfaceC4115e.add(Double.valueOf(abstractC15825e.tapsense()));
                } while (abstractC15825e.yandex() < yandex);
                return;
            }
            do {
                interfaceC4115e.add(Double.valueOf(abstractC15825e.tapsense()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC7986e abstractC7986e = (AbstractC7986e) interfaceC4115e;
        int i2 = this.vip & 7;
        if (i2 != 1) {
            if (i2 != 2) {
                throw C11872e.metrica();
            }
            int mo589native2 = abstractC15825e.mo589native();
            m3069e(mo589native2);
            int yandex2 = abstractC15825e.yandex() + mo589native2;
            do {
                abstractC7986e.billing(abstractC15825e.tapsense());
            } while (abstractC15825e.yandex() < yandex2);
            return;
        }
        do {
            abstractC7986e.billing(abstractC15825e.tapsense());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    public C5251e license() {
        AbstractC2301e.billing(this.metrica <= this.license);
        return new C5251e(this);
    }

    public void loadAd(InterfaceC16489e interfaceC16489e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC16489e instanceof AbstractC1654e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C8868e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC16489e.add(Boolean.valueOf(abstractC15825e.remoteconfig()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC16489e.add(Boolean.valueOf(abstractC15825e.remoteconfig()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC1654e abstractC1654e = (AbstractC1654e) interfaceC16489e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C8868e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                abstractC1654e.billing(abstractC15825e.remoteconfig());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            abstractC1654e.billing(abstractC15825e.remoteconfig());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    public void metrica() {
        View view = (View) this.appmetrica;
        int top = this.license - (view.getTop() - this.vip);
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.metrica));
    }

    public void mopub(Object obj, InterfaceC3028e interfaceC3028e, C16593e c16593e) {
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        int mo589native = abstractC15825e.mo589native();
        if (abstractC15825e.f31257e >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int subscription = abstractC15825e.subscription(mo589native);
        abstractC15825e.f31257e++;
        interfaceC3028e.startapp(obj, this, c16593e);
        abstractC15825e.vip(0);
        abstractC15825e.f31257e--;
        abstractC15825e.Signature(subscription);
    }

    /* renamed from: native, reason: not valid java name */
    public void m3115native(InterfaceC4115e interfaceC4115e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC4115e instanceof AbstractC12293e)) {
            int i = this.vip & 7;
            if (i == 2) {
                int mo589native = abstractC15825e.mo589native();
                m3070e(mo589native);
                int yandex = abstractC15825e.yandex() + mo589native;
                do {
                    interfaceC4115e.add(Float.valueOf(abstractC15825e.applovin()));
                } while (abstractC15825e.yandex() < yandex);
                return;
            }
            if (i != 5) {
                throw C11872e.metrica();
            }
            do {
                interfaceC4115e.add(Float.valueOf(abstractC15825e.applovin()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC12293e abstractC12293e = (AbstractC12293e) interfaceC4115e;
        int i2 = this.vip & 7;
        if (i2 == 2) {
            int mo589native2 = abstractC15825e.mo589native();
            m3070e(mo589native2);
            int yandex2 = abstractC15825e.yandex() + mo589native2;
            do {
                abstractC12293e.billing(abstractC15825e.applovin());
            } while (abstractC15825e.yandex() < yandex2);
            return;
        }
        if (i2 != 5) {
            throw C11872e.metrica();
        }
        do {
            abstractC12293e.billing(abstractC15825e.applovin());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    /* renamed from: new, reason: not valid java name */
    public void m3116new(InterfaceC17042e interfaceC17042e) {
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i != 1) {
            if (i != 2) {
                throw C11690e.vip();
            }
            int tapsense = abstractC3513e.tapsense();
            if ((tapsense & 7) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int vip = abstractC3513e.vip() + tapsense;
            do {
                ((C2423e) interfaceC17042e).add(Long.valueOf(abstractC3513e.Signature()));
            } while (abstractC3513e.vip() < vip);
            return;
        }
        do {
            ((C2423e) interfaceC17042e).add(Long.valueOf(abstractC3513e.Signature()));
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    /* renamed from: package, reason: not valid java name */
    public void m3117package(InterfaceC17042e interfaceC17042e) {
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i != 0) {
            if (i != 2) {
                throw C11690e.vip();
            }
            int vip = abstractC3513e.vip() + abstractC3513e.tapsense();
            do {
                ((C2423e) interfaceC17042e).add(Integer.valueOf(abstractC3513e.admob()));
            } while (abstractC3513e.vip() < vip);
            m3109for(vip);
            return;
        }
        do {
            ((C2423e) interfaceC17042e).add(Integer.valueOf(abstractC3513e.admob()));
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    public void premium(InterfaceC17042e interfaceC17042e) {
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i != 0) {
            if (i != 2) {
                throw C11690e.vip();
            }
            int vip = abstractC3513e.vip() + abstractC3513e.tapsense();
            do {
                ((C2423e) interfaceC17042e).add(Integer.valueOf(abstractC3513e.startapp()));
            } while (abstractC3513e.vip() < vip);
            m3109for(vip);
            return;
        }
        do {
            ((C2423e) interfaceC17042e).add(Integer.valueOf(abstractC3513e.startapp()));
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    /* renamed from: private, reason: not valid java name */
    public void m3118private(InterfaceC16489e interfaceC16489e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC16489e instanceof AbstractC14936e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C8868e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC16489e.add(Integer.valueOf(abstractC15825e.firebase()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC16489e.add(Integer.valueOf(abstractC15825e.firebase()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) interfaceC16489e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C8868e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                abstractC14936e.billing(abstractC15825e.firebase());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            abstractC14936e.billing(abstractC15825e.firebase());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    public void pro(InterfaceC4115e interfaceC4115e) {
        int mo594this;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if ((this.vip & 7) != 2) {
            throw C11872e.metrica();
        }
        do {
            interfaceC4115e.add(subscription());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this = abstractC15825e.mo594this();
            }
        } while (mo594this == this.vip);
        this.license = mo594this;
    }

    /* renamed from: protected, reason: not valid java name */
    public void m3119protected(InterfaceC17042e interfaceC17042e) {
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i != 0) {
            if (i != 2) {
                throw C11690e.vip();
            }
            int vip = abstractC3513e.vip() + abstractC3513e.tapsense();
            do {
                ((C2423e) interfaceC17042e).add(Integer.valueOf(abstractC3513e.smaato()));
            } while (abstractC3513e.vip() < vip);
            m3109for(vip);
            return;
        }
        do {
            ((C2423e) interfaceC17042e).add(Integer.valueOf(abstractC3513e.smaato()));
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    /* renamed from: public, reason: not valid java name */
    public boolean m3120public() {
        int i;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        if (abstractC3513e.metrica() || (i = this.vip) == this.metrica) {
            return false;
        }
        return abstractC3513e.inmobi(i);
    }

    public int purchase(int i) {
        return ((C12021e) this.appmetrica).billing[this.metrica + i];
    }

    public AbstractC10498e remoteconfig() {
        m3077continue(2);
        return ((AbstractC15825e) this.appmetrica).signatures();
    }

    /* renamed from: return, reason: not valid java name */
    public void m3121return(InterfaceC17042e interfaceC17042e, boolean z) {
        String remoteconfig;
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        if ((this.vip & 7) != 2) {
            throw C11690e.vip();
        }
        do {
            if (z) {
                m3077continue(2);
                remoteconfig = abstractC3513e.pro();
            } else {
                m3077continue(2);
                remoteconfig = abstractC3513e.remoteconfig();
            }
            ((C2423e) interfaceC17042e).add(remoteconfig);
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    public void signatures(InterfaceC16489e interfaceC16489e) {
        int mo594this;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if ((this.vip & 7) != 2) {
            throw C8868e.metrica();
        }
        do {
            interfaceC16489e.add(remoteconfig());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this = abstractC15825e.mo594this();
            }
        } while (mo594this == this.vip);
        this.license = mo594this;
    }

    public void smaato(Object obj, InterfaceC11969e interfaceC11969e, C3758e c3758e) {
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int tapsense = abstractC3513e.tapsense();
        if (abstractC3513e.ad + abstractC3513e.vip >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int appmetrica = abstractC3513e.appmetrica(tapsense);
        abstractC3513e.ad++;
        interfaceC11969e.startapp(obj, this, c3758e);
        abstractC3513e.ad(0);
        abstractC3513e.ad--;
        abstractC3513e.license(appmetrica);
    }

    public void startapp(Object obj, InterfaceC11115e interfaceC11115e, C5712e c5712e) {
        int i = this.metrica;
        this.metrica = ((this.vip >>> 3) << 3) | 4;
        try {
            interfaceC11115e.purchase(obj, this, c5712e);
            if (this.vip == this.metrica) {
            } else {
                throw C8868e.purchase();
            }
        } finally {
            this.metrica = i;
        }
    }

    /* renamed from: static, reason: not valid java name */
    public void m3122static(InterfaceC4115e interfaceC4115e, boolean z) {
        String mo588interface;
        int mo594this;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if ((this.vip & 7) != 2) {
            throw C11872e.metrica();
        }
        do {
            if (z) {
                m3077continue(2);
                mo588interface = abstractC15825e.mo586goto();
            } else {
                m3077continue(2);
                mo588interface = abstractC15825e.mo588interface();
            }
            interfaceC4115e.add(mo588interface);
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this = abstractC15825e.mo594this();
            }
        } while (mo594this == this.vip);
        this.license = mo594this;
    }

    /* renamed from: strictfp, reason: not valid java name */
    public void m3123strictfp(InterfaceC4115e interfaceC4115e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC4115e instanceof C4178e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C11872e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC4115e.add(Integer.valueOf(abstractC15825e.firebase()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC4115e.add(Integer.valueOf(abstractC15825e.firebase()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        C4178e c4178e = (C4178e) interfaceC4115e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C11872e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                c4178e.billing(abstractC15825e.firebase());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            c4178e.billing(abstractC15825e.firebase());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    public Object subs(EnumC3844e enumC3844e, Class cls, C3758e c3758e) {
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        switch (enumC3844e.ordinal()) {
            case 0:
                m3077continue(1);
                return Double.valueOf(abstractC3513e.yandex());
            case 1:
                m3077continue(5);
                return Float.valueOf(abstractC3513e.advert());
            case 2:
                m3077continue(0);
                return Long.valueOf(abstractC3513e.amazon());
            case 3:
                m3077continue(0);
                return Long.valueOf(abstractC3513e.isVip());
            case 4:
                m3077continue(0);
                return Integer.valueOf(abstractC3513e.smaato());
            case 5:
                m3077continue(1);
                return Long.valueOf(abstractC3513e.mopub());
            case 6:
                m3077continue(5);
                return Integer.valueOf(abstractC3513e.adcel());
            case 7:
                m3077continue(0);
                return Boolean.valueOf(abstractC3513e.purchase());
            case 8:
                m3077continue(2);
                return abstractC3513e.pro();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                m3077continue(2);
                InterfaceC11969e ad = C13571e.metrica.ad(cls);
                AbstractC18270e license = ad.license();
                smaato(license, ad, c3758e);
                ad.vip(license);
                return license;
            case 11:
                return admob();
            case 12:
                m3077continue(0);
                return Integer.valueOf(abstractC3513e.tapsense());
            case 13:
                m3077continue(0);
                return Integer.valueOf(abstractC3513e.startapp());
            case 14:
                m3077continue(5);
                return Integer.valueOf(abstractC3513e.loadAd());
            case 15:
                m3077continue(1);
                return Long.valueOf(abstractC3513e.Signature());
            case 16:
                m3077continue(0);
                return Integer.valueOf(abstractC3513e.admob());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                m3077continue(0);
                return Long.valueOf(abstractC3513e.subscription());
        }
    }

    public AbstractC4002e subscription() {
        m3077continue(2);
        return ((AbstractC15825e) this.appmetrica).pro();
    }

    /* renamed from: super, reason: not valid java name */
    public void m3124super(InterfaceC16489e interfaceC16489e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC16489e instanceof AbstractC11266e)) {
            int i = this.vip & 7;
            if (i != 1) {
                if (i != 2) {
                    throw C8868e.metrica();
                }
                int mo589native = abstractC15825e.mo589native();
                m3066e(mo589native);
                int yandex = abstractC15825e.yandex() + mo589native;
                do {
                    interfaceC16489e.add(Long.valueOf(abstractC15825e.crashlytics()));
                } while (abstractC15825e.yandex() < yandex);
                return;
            }
            do {
                interfaceC16489e.add(Long.valueOf(abstractC15825e.crashlytics()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC11266e abstractC11266e = (AbstractC11266e) interfaceC16489e;
        int i2 = this.vip & 7;
        if (i2 != 1) {
            if (i2 != 2) {
                throw C8868e.metrica();
            }
            int mo589native2 = abstractC15825e.mo589native();
            m3066e(mo589native2);
            int yandex2 = abstractC15825e.yandex() + mo589native2;
            do {
                abstractC11266e.billing(abstractC15825e.crashlytics());
            } while (abstractC15825e.yandex() < yandex2);
            return;
        }
        do {
            abstractC11266e.billing(abstractC15825e.crashlytics());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    /* renamed from: switch, reason: not valid java name */
    public void m3125switch(InterfaceC16489e interfaceC16489e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC16489e instanceof AbstractC14936e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C8868e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC16489e.add(Integer.valueOf(abstractC15825e.mo589native()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC16489e.add(Integer.valueOf(abstractC15825e.mo589native()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) interfaceC16489e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C8868e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                abstractC14936e.billing(abstractC15825e.mo589native());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            abstractC14936e.billing(abstractC15825e.mo589native());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public void m3126synchronized(InterfaceC16489e interfaceC16489e, boolean z) {
        String mo588interface;
        int mo594this;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if ((this.vip & 7) != 2) {
            throw C8868e.metrica();
        }
        do {
            if (z) {
                m3077continue(2);
                mo588interface = abstractC15825e.mo586goto();
            } else {
                m3077continue(2);
                mo588interface = abstractC15825e.mo588interface();
            }
            interfaceC16489e.add(mo588interface);
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this = abstractC15825e.mo594this();
            }
        } while (mo594this == this.vip);
        this.license = mo594this;
    }

    public void tapsense(InterfaceC17042e interfaceC17042e) {
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        if ((this.vip & 7) != 2) {
            throw C11690e.vip();
        }
        do {
            ((C2423e) interfaceC17042e).add(admob());
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    /* renamed from: this, reason: not valid java name */
    public void m3127this(InterfaceC17042e interfaceC17042e) {
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i != 1) {
            if (i != 2) {
                throw C11690e.vip();
            }
            int tapsense = abstractC3513e.tapsense();
            if ((tapsense & 7) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int vip = abstractC3513e.vip() + tapsense;
            do {
                ((C2423e) interfaceC17042e).add(Long.valueOf(abstractC3513e.mopub()));
            } while (abstractC3513e.vip() < vip);
            return;
        }
        do {
            ((C2423e) interfaceC17042e).add(Long.valueOf(abstractC3513e.mopub()));
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    /* renamed from: throw, reason: not valid java name */
    public void m3128throw(InterfaceC17042e interfaceC17042e) {
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i == 2) {
            int tapsense = abstractC3513e.tapsense();
            if ((tapsense & 3) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int vip = abstractC3513e.vip() + tapsense;
            do {
                ((C2423e) interfaceC17042e).add(Float.valueOf(abstractC3513e.advert()));
            } while (abstractC3513e.vip() < vip);
            return;
        }
        if (i != 5) {
            throw C11690e.vip();
        }
        do {
            ((C2423e) interfaceC17042e).add(Float.valueOf(abstractC3513e.advert()));
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    /* renamed from: throws, reason: not valid java name */
    public void m3129throws(InterfaceC17042e interfaceC17042e) {
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i != 0) {
            if (i != 2) {
                throw C11690e.vip();
            }
            int vip = abstractC3513e.vip() + abstractC3513e.tapsense();
            do {
                ((C2423e) interfaceC17042e).add(Integer.valueOf(abstractC3513e.tapsense()));
            } while (abstractC3513e.vip() < vip);
            m3109for(vip);
            return;
        }
        do {
            ((C2423e) interfaceC17042e).add(Integer.valueOf(abstractC3513e.tapsense()));
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    /* renamed from: transient, reason: not valid java name */
    public void m3130transient(InterfaceC4115e interfaceC4115e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC4115e instanceof AbstractC8400e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C11872e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC4115e.add(Long.valueOf(abstractC15825e.mo583class()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC4115e.add(Long.valueOf(abstractC15825e.mo583class()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC8400e abstractC8400e = (AbstractC8400e) interfaceC4115e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C11872e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                abstractC8400e.billing(abstractC15825e.mo583class());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            abstractC8400e.billing(abstractC15825e.mo583class());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    /* renamed from: try, reason: not valid java name */
    public void m3131try(InterfaceC16489e interfaceC16489e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC16489e instanceof AbstractC14936e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C8868e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC16489e.add(Integer.valueOf(abstractC15825e.ads()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC16489e.add(Integer.valueOf(abstractC15825e.ads()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) interfaceC16489e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C8868e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                abstractC14936e.billing(abstractC15825e.ads());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            abstractC14936e.billing(abstractC15825e.ads());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    public void vip(int i) {
        int[] iArr = (int[]) this.appmetrica;
        int i2 = this.metrica;
        iArr[i2] = i;
        int i3 = this.license & (i2 + 1);
        this.metrica = i3;
        int i4 = this.vip;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy((int[]) this.appmetrica, 0, iArr2, i5, this.vip);
            this.appmetrica = iArr2;
            this.vip = 0;
            this.metrica = length;
            this.license = i6 - 1;
        }
    }

    /* renamed from: volatile, reason: not valid java name */
    public void m3132volatile(InterfaceC17042e interfaceC17042e) {
        int signatures;
        AbstractC3513e abstractC3513e = (AbstractC3513e) this.appmetrica;
        int i = this.vip & 7;
        if (i != 0) {
            if (i != 2) {
                throw C11690e.vip();
            }
            int vip = abstractC3513e.vip() + abstractC3513e.tapsense();
            do {
                ((C2423e) interfaceC17042e).add(Long.valueOf(abstractC3513e.isVip()));
            } while (abstractC3513e.vip() < vip);
            m3109for(vip);
            return;
        }
        do {
            ((C2423e) interfaceC17042e).add(Long.valueOf(abstractC3513e.isVip()));
            if (abstractC3513e.metrica()) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == this.vip);
        this.license = signatures;
    }

    /* renamed from: while, reason: not valid java name */
    public void m3133while(InterfaceC4115e interfaceC4115e) {
        int mo594this;
        int mo594this2;
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.appmetrica;
        if (!(interfaceC4115e instanceof C4178e)) {
            int i = this.vip & 7;
            if (i != 0) {
                if (i != 2) {
                    throw C11872e.metrica();
                }
                int yandex = abstractC15825e.yandex() + abstractC15825e.mo589native();
                do {
                    interfaceC4115e.add(Integer.valueOf(abstractC15825e.ads()));
                } while (abstractC15825e.yandex() < yandex);
                m3109for(yandex);
                return;
            }
            do {
                interfaceC4115e.add(Integer.valueOf(abstractC15825e.ads()));
                if (abstractC15825e.startapp()) {
                    return;
                } else {
                    mo594this = abstractC15825e.mo594this();
                }
            } while (mo594this == this.vip);
            this.license = mo594this;
            return;
        }
        C4178e c4178e = (C4178e) interfaceC4115e;
        int i2 = this.vip & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw C11872e.metrica();
            }
            int yandex2 = abstractC15825e.yandex() + abstractC15825e.mo589native();
            do {
                c4178e.billing(abstractC15825e.ads());
            } while (abstractC15825e.yandex() < yandex2);
            m3109for(yandex2);
            return;
        }
        do {
            c4178e.billing(abstractC15825e.ads());
            if (abstractC15825e.startapp()) {
                return;
            } else {
                mo594this2 = abstractC15825e.mo594this();
            }
        } while (mo594this2 == this.vip);
        this.license = mo594this2;
    }

    public void yandex(Object obj, InterfaceC3028e interfaceC3028e, C16593e c16593e) {
        int i = this.metrica;
        this.metrica = ((this.vip >>> 3) << 3) | 4;
        try {
            interfaceC3028e.startapp(obj, this, c16593e);
            if (this.vip == this.metrica) {
            } else {
                throw C11872e.purchase();
            }
        } finally {
            this.metrica = i;
        }
    }
}
