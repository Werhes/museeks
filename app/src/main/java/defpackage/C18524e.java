package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۧۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18524e implements InterfaceC3604e, InterfaceC18191e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f36316e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f36317e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f36318e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f36319e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36320e;

    public C18524e(long j, int i) {
        this.f36320e = 4;
        AbstractC2301e.subscription(((C10919e) this.f36317e) == null);
        this.f36318e = j;
        this.f36319e = j + i;
    }

    public C18524e(C1040e c1040e, C0971e c0971e, long j) {
        this.f36320e = 5;
        this.f36317e = c1040e;
        this.f36316e = c0971e;
        this.f36319e = j;
        this.f36318e = 0L;
    }

    public C18524e(C2285e c2285e) {
        this.f36320e = 6;
        this.f36316e = c2285e;
        C6936e c6936e = (C6936e) c2285e.f36443e;
        this.f36317e = new C9940e(this, c6936e, 0);
        c6936e.f14215e.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f36318e = elapsedRealtime;
        this.f36319e = elapsedRealtime;
    }

    public C18524e(C7699e c7699e, long j) {
        this.f36320e = 3;
        this.f36316e = c7699e;
        this.f36317e = new LinkedHashMap(0, 0.75f, true);
        this.f36318e = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    public C18524e(String str, byte[] bArr, long j, long j2) {
        this.f36320e = 0;
        this.f36317e = str;
        this.f36316e = bArr;
        this.f36318e = j;
        this.f36319e = j2;
    }

    public C18524e(ByteOrder byteOrder) {
        this.f36320e = 1;
        this.f36316e = byteOrder;
    }

    @Override // defpackage.InterfaceC18191e
    public boolean ad(long j) {
        InterfaceC0043e interfaceC0043e = (InterfaceC0043e) ((C1040e) this.f36317e).invoke();
        if (interfaceC0043e == null) {
            return true;
        }
        C0971e c0971e = (C0971e) this.f36316e;
        long j2 = this.f36319e;
        if (!interfaceC0043e.billing() || !AbstractC5956e.ad(c0971e, j2)) {
            return false;
        }
        if (!c0971e.vip(interfaceC0043e, j, this.f36318e, C5107e.f10953e, false)) {
            return true;
        }
        this.f36318e = j;
        return true;
    }

    @Override // defpackage.InterfaceC18191e
    public void adcel() {
        C18408e c18408e = ((C0971e) this.f36316e).yandex;
        if (c18408e != null) {
            c18408e.invoke();
        }
    }

    @Override // defpackage.InterfaceC18191e
    public boolean advert(long j, C16658e c16658e, int i) {
        InterfaceC0043e interfaceC0043e = (InterfaceC0043e) ((C1040e) this.f36317e).invoke();
        if (interfaceC0043e == null) {
            return false;
        }
        C0971e c0971e = (C0971e) this.f36316e;
        long j2 = this.f36319e;
        if (!interfaceC0043e.billing()) {
            return false;
        }
        C8035e c8035e = c0971e.purchase;
        if (c8035e != null) {
            c8035e.invoke(Boolean.FALSE, interfaceC0043e, new C2152e(j), c16658e);
        }
        this.f36318e = j;
        return AbstractC5956e.ad(c0971e, j2);
    }

    @Override // defpackage.InterfaceC18191e
    public boolean amazon(long j) {
        InterfaceC0043e interfaceC0043e = (InterfaceC0043e) ((C1040e) this.f36317e).invoke();
        if (interfaceC0043e == null) {
            return false;
        }
        C0971e c0971e = (C0971e) this.f36316e;
        long j2 = this.f36319e;
        if (!interfaceC0043e.billing()) {
            return false;
        }
        if (c0971e.vip(interfaceC0043e, j, this.f36318e, C5107e.f10953e, false)) {
            this.f36318e = j;
        }
        return AbstractC5956e.ad(c0971e, j2);
    }

    public void appmetrica(FileChannel fileChannel) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        this.f36319e = fileChannel.position();
        fileChannel.read(allocate);
        allocate.order((ByteOrder) this.f36316e);
        allocate.position(0);
        this.f36317e = AbstractC1983e.adcel(allocate);
        this.f36318e = allocate.getInt();
    }

    public void billing(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f36317e;
        while (license() > j) {
            if (linkedHashMap.isEmpty()) {
                if (license() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) AbstractC13480e.m3573class(linkedHashMap.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.remove(key);
            this.f36319e = license() - purchase(key, value);
            metrica(key, value, null);
        }
    }

    public long license() {
        if (this.f36319e == -1) {
            long j = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.f36317e).entrySet()) {
                j += purchase(entry.getKey(), entry.getValue());
            }
            this.f36319e = j;
        }
        return this.f36319e;
    }

    @Override // defpackage.InterfaceC3604e
    public InterfaceC6347e loadAd() {
        AbstractC2301e.subscription(this.f36318e != -1);
        return new C5990e((C15008e) this.f36317e, this.f36318e, 1);
    }

    public void metrica(Object obj, Object obj2, C8732e c8732e) {
        C8732e c8732e2 = (C8732e) obj2;
        ((C13572e) ((C7699e) this.f36316e).f15624e).inmobi((C15695e) obj, c8732e2.ad, c8732e2.vip, c8732e2.metrica);
    }

    public long purchase(Object obj, Object obj2) {
        try {
            long j = ((C8732e) obj2).metrica;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.f36319e = -1L;
            throw e;
        }
    }

    @Override // defpackage.InterfaceC18191e
    public boolean smaato(long j, C16658e c16658e) {
        InterfaceC0043e interfaceC0043e = (InterfaceC0043e) ((C1040e) this.f36317e).invoke();
        if (interfaceC0043e == null) {
            return true;
        }
        C0971e c0971e = (C0971e) this.f36316e;
        long j2 = this.f36319e;
        if (!interfaceC0043e.billing() || !AbstractC5956e.ad(c0971e, j2)) {
            return false;
        }
        if (!c0971e.vip(interfaceC0043e, j, this.f36318e, c16658e, false)) {
            return true;
        }
        this.f36318e = j;
        return true;
    }

    @Override // defpackage.InterfaceC3604e
    public void tapsense(long j) {
        long[] jArr = (long[]) ((C16911e) this.f36316e).f33137e;
        this.f36319e = jArr[AbstractC9413e.purchase(jArr, j, true)];
    }

    public String toString() {
        switch (this.f36320e) {
            case 1:
                StringBuilder sb = new StringBuilder(128);
                sb.append("ChunkHeader{, id='");
                sb.append((String) this.f36317e);
                sb.append("', startLocationInFile=");
                sb.append(this.f36319e);
                sb.append("size=");
                sb.append(this.f36318e);
                sb.append(" sizeIncludingHeader=");
                return AbstractC10257e.mopub(sb, this.f36318e + 8, '}');
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC3604e
    public long vip(InterfaceC2283e interfaceC2283e) {
        long j = this.f36319e;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.f36319e = -1L;
        return j2;
    }

    public boolean yandex(long j, boolean z, boolean z2) {
        C2285e c2285e = (C2285e) this.f36316e;
        c2285e.mo2250e();
        c2285e.m1411e();
        C6936e c6936e = (C6936e) c2285e.f36443e;
        boolean ad = c6936e.ad();
        C13879e c13879e = c6936e.f14227e;
        if (ad) {
            C1195e c1195e = c6936e.f14198e;
            C6936e.purchase(c1195e);
            C5982e c5982e = c1195e.f3806e;
            c6936e.f14215e.getClass();
            c5982e.license(System.currentTimeMillis());
        }
        long j2 = j - this.f36318e;
        if (!z && j2 < 1000) {
            C6936e.yandex(c13879e);
            c13879e.f27497e.vip(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.f36319e;
            this.f36319e = j;
        }
        C6936e.yandex(c13879e);
        c13879e.f27497e.vip(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !c6936e.f14221e.m2815e();
        C10693e c10693e = c6936e.f14200e;
        C6936e.billing(c10693e);
        C5240e.m1787e(c10693e.m2914e(z3), bundle, true);
        if (!z2) {
            C8320e c8320e = c6936e.f14199e;
            C6936e.billing(c8320e);
            c8320e.m2406e("auto", "_e", bundle);
        }
        this.f36318e = j;
        C9940e c9940e = (C9940e) this.f36317e;
        c9940e.metrica();
        c9940e.vip(((Long) AbstractC17254e.f33848e.ad(null)).longValue());
        return true;
    }
}
