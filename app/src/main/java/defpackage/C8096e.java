package defpackage;

import android.os.SystemClock;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٞٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8096e implements InterfaceC12765e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f16441e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C7735e f16442e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f16443e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f16444e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C16680e f16445e;

    public C8096e(C16680e c16680e, int i, C7735e c7735e, long j, long j2) {
        this.f16445e = c16680e;
        this.f16443e = i;
        this.f16442e = c7735e;
        this.f16444e = j;
        this.f16441e = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C14113e ad(defpackage.C1623e r4, defpackage.AbstractC6785e r5, int r6) {
        /*
            eؖۖٛ r5 = r5.inmobi
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            eٓٝؕ r5 = r5.f9385e
        L9:
            if (r5 == 0) goto L35
            boolean r1 = r5.f27926e
            if (r1 == 0) goto L35
            int[] r1 = r5.f27927e
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.f27929e
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L35
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L35
            r3 = r1[r2]
            if (r3 != r6) goto L32
        L2b:
            int r4 = r4.amazon
            int r6 = r5.f27924e
            if (r4 >= r6) goto L35
            return r5
        L32:
            int r2 = r2 + 1
            goto L24
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8096e.ad(eؓؗٞ, eؙۦؒ, int):eٓٝؕ");
    }

    @Override // defpackage.InterfaceC12765e
    /* renamed from: final */
    public final void mo213final(C0560e c0560e) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        C16680e c16680e = this.f16445e;
        if (c16680e.appmetrica()) {
            C2831e c2831e = (C2831e) C7850e.crashlytics().f15896e;
            if (c2831e == null || c2831e.f6799e) {
                C1623e c1623e = (C1623e) c16680e.f32737e.get(this.f16442e);
                if (c1623e != null) {
                    Object obj = c1623e.license;
                    if (obj instanceof AbstractC6785e) {
                        AbstractC6785e abstractC6785e = (AbstractC6785e) obj;
                        long j3 = this.f16444e;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        int i7 = abstractC6785e.subscription;
                        if (c2831e != null) {
                            z &= c2831e.f6798e;
                            i = c2831e.f6800e;
                            i3 = c2831e.f6797e;
                            i2 = c2831e.f6801e;
                            if (abstractC6785e.inmobi != null && !abstractC6785e.pro()) {
                                C14113e ad = ad(c1623e, abstractC6785e, this.f16443e);
                                if (ad == null) {
                                    return;
                                }
                                boolean z2 = ad.f27925e && j3 > 0;
                                i3 = ad.f27924e;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i8 = i;
                        int i9 = -1;
                        if (c0560e.advert()) {
                            i5 = 0;
                        } else if (c0560e.license) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception startapp = c0560e.startapp();
                            if (startapp instanceof C10427e) {
                                Status status = ((C10427e) startapp).f20605e;
                                i4 = status.f733e;
                                C14758e c14758e = status.f732e;
                                if (c14758e != null) {
                                    i5 = i4;
                                    i6 = c14758e.f29190e;
                                }
                            } else {
                                i4 = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.f16441e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i9 = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = currentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        C1001e c1001e = new C1001e(new C11632e(this.f16443e, i5, i6, j, j2, null, null, i7, i9), i2, i8, i3);
                        HandlerC9134e handlerC9134e = c16680e.f32734e;
                        handlerC9134e.sendMessage(handlerC9134e.obtainMessage(18, c1001e));
                    }
                }
            }
        }
    }
}
