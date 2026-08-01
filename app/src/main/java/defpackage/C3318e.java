package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3318e implements InterfaceC2283e, InterfaceC5483e, InterfaceC9307e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f7485e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f7486e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7487e;

    public C3318e(int i) {
        this.f7487e = i;
        switch (i) {
            case 1:
                this.f7486e = 0L;
                return;
            default:
                return;
        }
    }

    public /* synthetic */ C3318e(long j, Object obj, int i) {
        this.f7487e = i;
        this.f7486e = j;
        this.f7485e = obj;
    }

    public C3318e(InterfaceC2283e interfaceC2283e, long j) {
        this.f7487e = 4;
        this.f7485e = interfaceC2283e;
        AbstractC2301e.billing(interfaceC2283e.getPosition() >= j);
        this.f7486e = j;
    }

    public C3318e(InterfaceC4895e interfaceC4895e) {
        this.f7487e = 2;
        this.f7485e = interfaceC4895e;
        this.f7486e = 262144L;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3318e(EnumC17426e enumC17426e, int i) {
        this((i & 1) != 0 ? null : enumC17426e, 0L, 6);
        this.f7487e = 6;
    }

    public C3318e(C17647e c17647e) {
        this.f7487e = 9;
        AbstractC9528e.startapp(c17647e);
        this.f7485e = c17647e;
    }

    public /* synthetic */ C3318e(Object obj, long j, int i) {
        this.f7487e = i;
        this.f7485e = obj;
        this.f7486e = j;
    }

    @Override // defpackage.InterfaceC5483e
    public InterfaceC18147e Signature(int i, int i2) {
        return ((InterfaceC5483e) this.f7485e).Signature(i, i2);
    }

    @Override // defpackage.InterfaceC2283e
    public void ad(int i, int i2, byte[] bArr) {
        ((InterfaceC2283e) this.f7485e).ad(i, i2, bArr);
    }

    @Override // defpackage.InterfaceC2283e
    public int adcel(int i) {
        return ((InterfaceC2283e) this.f7485e).adcel(i);
    }

    public void admob(int i) {
        if (i < 64) {
            this.f7486e &= ~(1 << i);
            return;
        }
        C3318e c3318e = (C3318e) this.f7485e;
        if (c3318e != null) {
            c3318e.admob(i - 64);
        }
    }

    public void ads() {
        this.f7486e = 0L;
        C3318e c3318e = (C3318e) this.f7485e;
        if (c3318e != null) {
            c3318e.ads();
        }
    }

    @Override // defpackage.InterfaceC2283e
    public void amazon(int i) {
        ((InterfaceC2283e) this.f7485e).amazon(i);
    }

    public boolean applovin(int i) {
        if (i >= 64) {
            remoteconfig();
            return ((C3318e) this.f7485e).applovin(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f7486e;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f7486e = j3;
        long j4 = j - 1;
        this.f7486e = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C3318e c3318e = (C3318e) this.f7485e;
        if (c3318e != null) {
            if (c3318e.signatures(0)) {
                premium(63);
            }
            ((C3318e) this.f7485e).applovin(0);
        }
        return z;
    }

    @Override // defpackage.InterfaceC2283e
    public int appmetrica(int i, int i2, byte[] bArr) {
        return ((InterfaceC2283e) this.f7485e).appmetrica(i, i2, bArr);
    }

    @Override // defpackage.InterfaceC2283e
    public boolean billing(byte[] bArr, int i, int i2, boolean z) {
        return ((InterfaceC2283e) this.f7485e).billing(bArr, i, i2, z);
    }

    @Override // defpackage.InterfaceC9307e
    /* renamed from: eؘؕۥ */
    public void mo268e(Exception exc) {
        switch (this.f7487e) {
            case 7:
                int i = exc instanceof C10427e ? ((C10427e) exc).f20605e.f733e : 13;
                long j = this.f7486e;
                Iterator it = ((List) ((C5710e) ((C0912e) this.f7485e).f3333e).metrica.license).iterator();
                while (it.hasNext()) {
                    ((C9427e) it.next()).license(j, i, null);
                }
                return;
            case 8:
                ((AtomicLong) ((C6029e) this.f7485e).f12700e).set(this.f7486e);
                return;
            default:
                ((AtomicLong) ((C17659e) this.f7485e).f34612e).set(this.f7486e);
                return;
        }
    }

    @Override // defpackage.InterfaceC2283e
    public long getLength() {
        return ((InterfaceC2283e) this.f7485e).getLength() - this.f7486e;
    }

    @Override // defpackage.InterfaceC2283e
    public long getPosition() {
        return ((InterfaceC2283e) this.f7485e).getPosition() - this.f7486e;
    }

    public float inmobi(long j) {
        return Float.intBitsToFloat((int) (((EnumC17426e) this.f7485e) == EnumC17426e.f34145e ? j >> 32 : j & 4294967295L));
    }

    public C15793e isPro() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String mo1678case = ((InterfaceC4895e) this.f7485e).mo1678case(this.f7486e);
            this.f7486e -= mo1678case.length();
            if (mo1678case.length() == 0) {
                return new C15793e((String[]) arrayList.toArray(new String[0]));
            }
            int m1865interface = AbstractC5304e.m1865interface(mo1678case, ':', 1, 4);
            if (m1865interface != -1) {
                String substring = mo1678case.substring(0, m1865interface);
                String substring2 = mo1678case.substring(m1865interface + 1);
                arrayList.add(substring);
                arrayList.add(AbstractC5304e.m1855const(substring2).toString());
            } else if (mo1678case.charAt(0) == ':') {
                String substring3 = mo1678case.substring(1);
                arrayList.add(BuildConfig.FLAVOR);
                arrayList.add(AbstractC5304e.m1855const(substring3).toString());
            } else {
                arrayList.add(BuildConfig.FLAVOR);
                arrayList.add(AbstractC5304e.m1855const(mo1678case).toString());
            }
        }
    }

    public void isVip(int i, boolean z) {
        if (i >= 64) {
            remoteconfig();
            ((C3318e) this.f7485e).isVip(i - 64, z);
            return;
        }
        long j = this.f7486e;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f7486e = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            premium(i);
        } else {
            admob(i);
        }
        if (z2 || ((C3318e) this.f7485e) != null) {
            remoteconfig();
            ((C3318e) this.f7485e).isVip(0, z2);
        }
    }

    @Override // defpackage.InterfaceC5483e
    public void mopub() {
        ((InterfaceC5483e) this.f7485e).mopub();
    }

    public void premium(int i) {
        if (i < 64) {
            this.f7486e |= 1 << i;
        } else {
            remoteconfig();
            ((C3318e) this.f7485e).premium(i - 64);
        }
    }

    @Override // defpackage.InterfaceC5483e
    public void pro(InterfaceC6347e interfaceC6347e) {
        ((InterfaceC5483e) this.f7485e).pro(new C13104e(this, interfaceC6347e, interfaceC6347e));
    }

    @Override // defpackage.InterfaceC2283e
    public boolean purchase(int i, boolean z) {
        return ((InterfaceC2283e) this.f7485e).purchase(i, true);
    }

    @Override // defpackage.InterfaceC15672e
    public int read(byte[] bArr, int i, int i2) {
        return ((InterfaceC2283e) this.f7485e).read(bArr, i, i2);
    }

    @Override // defpackage.InterfaceC2283e
    public void readFully(byte[] bArr, int i, int i2) {
        ((InterfaceC2283e) this.f7485e).readFully(bArr, i, i2);
    }

    public void remoteconfig() {
        if (((C3318e) this.f7485e) == null) {
            this.f7485e = new C3318e(1);
        }
    }

    public boolean signatures(int i) {
        if (i < 64) {
            return (this.f7486e & (1 << i)) != 0;
        }
        remoteconfig();
        return ((C3318e) this.f7485e).signatures(i - 64);
    }

    @Override // defpackage.InterfaceC2283e
    public void smaato() {
        ((InterfaceC2283e) this.f7485e).smaato();
    }

    @Override // defpackage.InterfaceC2283e
    public void startapp(int i) {
        ((InterfaceC2283e) this.f7485e).startapp(i);
    }

    public int subscription(int i) {
        C3318e c3318e = (C3318e) this.f7485e;
        if (c3318e == null) {
            return i >= 64 ? Long.bitCount(this.f7486e) : Long.bitCount(this.f7486e & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f7486e & ((1 << i) - 1));
        }
        return Long.bitCount(this.f7486e) + c3318e.subscription(i - 64);
    }

    public long tapsense(float f, long j, boolean z) {
        long startapp;
        if (z) {
            startapp = C2152e.startapp(this.f7486e, j);
            this.f7486e = startapp;
        } else {
            startapp = C2152e.startapp(this.f7486e, j);
        }
        if ((((EnumC17426e) this.f7485e) == null ? C2152e.metrica(startapp) : Math.abs(inmobi(startapp))) < f) {
            return 9205357640488583168L;
        }
        if (((EnumC17426e) this.f7485e) == null) {
            long j2 = this.f7486e;
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / C2152e.metrica(j2);
            return C2152e.yandex(this.f7486e, C2152e.adcel(f, (4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / r8)) | (Float.floatToRawIntBits(intBitsToFloat) << 32)));
        }
        float inmobi = inmobi(this.f7486e) - (Math.signum(inmobi(this.f7486e)) * f);
        long j3 = this.f7486e;
        EnumC17426e enumC17426e = (EnumC17426e) this.f7485e;
        EnumC17426e enumC17426e2 = EnumC17426e.f34145e;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (enumC17426e == enumC17426e2 ? j3 & 4294967295L : j3 >> 32));
        if (((EnumC17426e) this.f7485e) == enumC17426e2) {
            return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(inmobi) << 32);
        }
        return (Float.floatToRawIntBits(inmobi) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
    }

    public String toString() {
        switch (this.f7487e) {
            case 1:
                if (((C3318e) this.f7485e) == null) {
                    return Long.toBinaryString(this.f7486e);
                }
                return ((C3318e) this.f7485e).toString() + "xx" + Long.toBinaryString(this.f7486e);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC2283e
    public boolean vip(byte[] bArr, int i, int i2, boolean z) {
        return ((InterfaceC2283e) this.f7485e).vip(bArr, 0, i2, z);
    }

    @Override // defpackage.InterfaceC2283e
    public long yandex() {
        return ((InterfaceC2283e) this.f7485e).yandex() - this.f7486e;
    }
}
