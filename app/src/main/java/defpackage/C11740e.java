package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11740e implements InterfaceC14239e, InterfaceC6901e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Csuper f23607e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public byte[] f23608e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f23609e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC4407e f23610e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C16975e f23611e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f23612e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC15169e f23613e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final long f23614e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final boolean f23615e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C5401e f23616e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C18478e f23617e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C2435e f23618e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final ArrayList f23619e = new ArrayList();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C12931e f23620e;

    public C11740e(C2435e c2435e, InterfaceC15169e interfaceC15169e, InterfaceC4407e interfaceC4407e, C16975e c16975e, long j, C5401e c5401e, Csuper csuper, boolean z, ExecutorC17731e executorC17731e) {
        this.f23618e = c2435e;
        this.f23613e = interfaceC15169e;
        this.f23610e = interfaceC4407e;
        this.f23611e = c16975e;
        this.f23614e = j;
        this.f23616e = c5401e;
        this.f23607e = csuper;
        this.f23615e = z;
        this.f23620e = new C12931e(new C16437e(BuildConfig.FLAVOR, c16975e));
        this.f23617e = executorC17731e != null ? new C18478e(2, executorC17731e) : new C18478e("SingleSampleMediaPeriod");
    }

    @Override // defpackage.InterfaceC6901e
    public final void adcel(InterfaceC15834e interfaceC15834e, long j, long j2, int i) {
        C5258e c5258e = (C5258e) interfaceC15834e;
        C9344e c9344e = c5258e.vip;
        this.f23607e.m4641break(i == 0 ? new C6913e(c5258e.ad, j) : new C6913e(c5258e.ad, c9344e.f18614e, c9344e.f18616e, j, j2, c9344e.f18615e), 1, -1, this.f23611e, 0, null, 0L, this.f23614e, i);
    }

    @Override // defpackage.InterfaceC14585e
    public final long admob() {
        return this.f23609e ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.InterfaceC14239e
    public final long advert() {
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC14239e
    public final C12931e amazon() {
        return this.f23620e;
    }

    @Override // defpackage.InterfaceC14239e
    public final long appmetrica(long j, C1198e c1198e) {
        return j;
    }

    @Override // defpackage.InterfaceC14239e
    public final void billing() {
    }

    @Override // defpackage.InterfaceC14585e
    public final long license() {
        return (this.f23609e || this.f23617e.m4529case()) ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.InterfaceC14585e
    public final boolean loadAd(C6576e c6576e) {
        if (this.f23609e) {
            return false;
        }
        C18478e c18478e = this.f23617e;
        if (c18478e.m4529case() || ((IOException) c18478e.f36229e) != null) {
            return false;
        }
        InterfaceC9660e remoteconfig = this.f23613e.remoteconfig();
        InterfaceC4407e interfaceC4407e = this.f23610e;
        if (interfaceC4407e != null) {
            remoteconfig.license(interfaceC4407e);
        }
        c18478e.m4539e(new C5258e(remoteconfig, this.f23618e), this, this.f23616e.isPro(1));
        return true;
    }

    @Override // defpackage.InterfaceC14239e
    public final long metrica(InterfaceC17119e[] interfaceC17119eArr, boolean[] zArr, InterfaceC4543e[] interfaceC4543eArr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC17119eArr.length; i++) {
            InterfaceC4543e interfaceC4543e = interfaceC4543eArr[i];
            ArrayList arrayList = this.f23619e;
            if (interfaceC4543e != null && (interfaceC17119eArr[i] == null || !zArr[i])) {
                arrayList.remove(interfaceC4543e);
                interfaceC4543eArr[i] = null;
            }
            if (interfaceC4543eArr[i] == null && interfaceC17119eArr[i] != null) {
                C14024e c14024e = new C14024e(this);
                arrayList.add(c14024e);
                interfaceC4543eArr[i] = c14024e;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // defpackage.InterfaceC6901e
    public final void purchase(InterfaceC15834e interfaceC15834e, long j, long j2) {
        C5258e c5258e = (C5258e) interfaceC15834e;
        this.f23612e = (int) c5258e.vip.f18615e;
        byte[] bArr = c5258e.metrica;
        bArr.getClass();
        this.f23608e = bArr;
        this.f23609e = true;
        C9344e c9344e = c5258e.vip;
        C6913e c6913e = new C6913e(c5258e.ad, c9344e.f18614e, c9344e.f18616e, j, j2, this.f23612e);
        this.f23616e.getClass();
        this.f23607e.m4660while(c6913e, 1, -1, this.f23611e, 0, null, 0L, this.f23614e);
    }

    @Override // defpackage.InterfaceC6901e
    public final C9436e signatures(InterfaceC15834e interfaceC15834e, long j, long j2, IOException iOException, int i) {
        long min;
        IOException iOException2;
        C9436e c9436e;
        C5258e c5258e = (C5258e) interfaceC15834e;
        C9344e c9344e = c5258e.vip;
        C6913e c6913e = new C6913e(c5258e.ad, c9344e.f18614e, c9344e.f18616e, j, j2, c9344e.f18615e);
        String str = AbstractC9413e.ad;
        C5401e c5401e = this.f23616e;
        c5401e.getClass();
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof C15125e) || (th instanceof FileNotFoundException) || (th instanceof C15585e) || (th instanceof C11705e) || ((th instanceof C18297e) && ((C18297e) th).f35943e == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i - 1) * 1000, 5000);
        boolean z = min == -9223372036854775807L || i >= c5401e.isPro(1);
        if (this.f23615e && z) {
            iOException2 = iOException;
            AbstractC2803e.amazon("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.f23609e = true;
            c9436e = C18478e.f36224e;
        } else {
            iOException2 = iOException;
            c9436e = min != -9223372036854775807L ? new C9436e(0, min, false) : C18478e.f36222e;
        }
        int i2 = c9436e.f18776e;
        boolean z2 = i2 == 0 || i2 == 1;
        this.f23607e.m4659try(c6913e, 1, -1, this.f23611e, 0, null, 0L, this.f23614e, iOException2, !z2);
        if (!z2) {
            c5401e.getClass();
        }
        return c9436e;
    }

    @Override // defpackage.InterfaceC14239e
    public final void smaato(InterfaceC1145e interfaceC1145e, long j) {
        interfaceC1145e.ad(this);
    }

    @Override // defpackage.InterfaceC14239e
    public final void startapp(long j) {
    }

    @Override // defpackage.InterfaceC14585e
    public final boolean subscription() {
        return this.f23617e.m4529case();
    }

    @Override // defpackage.InterfaceC14585e
    public final void tapsense(long j) {
    }

    @Override // defpackage.InterfaceC6901e
    public final void vip(InterfaceC15834e interfaceC15834e, long j, long j2, boolean z) {
        C5258e c5258e = (C5258e) interfaceC15834e;
        C9344e c9344e = c5258e.vip;
        C6913e c6913e = new C6913e(c5258e.ad, c9344e.f18614e, c9344e.f18616e, j, j2, c9344e.f18615e);
        this.f23616e.getClass();
        this.f23607e.m4657throw(c6913e, 1, -1, null, 0, null, 0L, this.f23614e);
    }

    @Override // defpackage.InterfaceC14239e
    public final long yandex(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f23619e;
            if (i >= arrayList.size()) {
                return j;
            }
            C14024e c14024e = (C14024e) arrayList.get(i);
            if (c14024e.f27748e == 2) {
                c14024e.f27748e = 1;
            }
            i++;
        }
    }
}
