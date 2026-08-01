package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٙٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17086e extends AbstractC16510e {
    public final Object pro;
    public final Size remoteconfig;
    public C12417e signatures;
    public C1385e tapsense;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        if (r0 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        r11 = r10[0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C17086e(defpackage.C13825e r10, defpackage.C2405e r11, defpackage.C0477e r12) {
        /*
            r9 = this;
            r9.<init>(r11)
            android.util.Size r11 = defpackage.AbstractC2503e.ad
            eُّؔ r10 = r10.vip
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            eٌ۟ r10 = (defpackage.C9000e) r10
            java.lang.Object r10 = r10.metrica(r0)
            android.hardware.camera2.params.StreamConfigurationMap r10 = (android.hardware.camera2.params.StreamConfigurationMap) r10
            r0 = 0
            java.lang.String r1 = "CXCP"
            if (r10 != 0) goto L23
            boolean r10 = defpackage.AbstractC9464e.amazon()
            if (r10 == 0) goto L21
            java.lang.String r10 = "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP."
            android.util.Log.e(r1, r10)
        L21:
            r10 = r0
            goto L29
        L23:
            r2 = 34
            android.util.Size[] r10 = r10.getOutputSizes(r2)
        L29:
            if (r10 != 0) goto L2d
            goto Lc0
        L2d:
            int r2 = r10.length
            if (r2 != 0) goto L32
            goto Lc0
        L32:
            android.util.Size r11 = defpackage.AbstractC14337e.ad
            java.lang.Class<androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk> r11 = androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.class
            eٕۗۜ r11 = defpackage.AbstractC16338e.ad(r11)
            androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk r11 = (androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk) r11
            r2 = 0
            if (r11 != 0) goto L41
            r11 = r10
            goto L64
        L41:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r3 = r10.length
            r4 = r2
        L48:
            if (r4 >= r3) goto L5c
            r5 = r10[r4]
            eٔۗٙ r6 = defpackage.AbstractC14337e.vip
            android.util.Size r7 = defpackage.AbstractC14337e.ad
            int r6 = r6.compare(r5, r7)
            if (r6 < 0) goto L59
            r11.add(r5)
        L59:
            int r4 = r4 + 1
            goto L48
        L5c:
            android.util.Size[] r3 = new android.util.Size[r2]
            java.lang.Object[] r11 = r11.toArray(r3)
            android.util.Size[] r11 = (android.util.Size[]) r11
        L64:
            int r3 = r11.length
            if (r3 != 0) goto L73
            boolean r11 = defpackage.AbstractC9464e.admob()
            if (r11 == 0) goto L74
            java.lang.String r11 = "No supported output size list, fallback to current list"
            android.util.Log.w(r1, r11)
            goto L74
        L73:
            r10 = r11
        L74:
            int r11 = r10.length
            r1 = 1
            if (r11 <= r1) goto L84
            eٍِ٘ r11 = new eٍِ٘
            r3 = 2
            r11.<init>(r3)
            int r3 = r10.length
            if (r3 <= r1) goto L84
            java.util.Arrays.sort(r10, r11)
        L84:
            android.util.Size r11 = r12.metrica()
            int r12 = r11.getWidth()
            long r3 = (long) r12
            int r11 = r11.getHeight()
            long r11 = (long) r11
            long r3 = r3 * r11
            r11 = 307200(0x4b000, double:1.51777E-318)
            long r11 = java.lang.Math.min(r11, r3)
            int r1 = r10.length
            r3 = r2
        L9c:
            if (r3 >= r1) goto Lbc
            r4 = r10[r3]
            int r5 = r4.getWidth()
            long r5 = (long) r5
            int r7 = r4.getHeight()
            long r7 = (long) r7
            long r5 = r5 * r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 != 0) goto Lb1
            r11 = r4
            goto Lc0
        Lb1:
            if (r5 <= 0) goto Lb8
            if (r0 != 0) goto Lb6
            goto Lbc
        Lb6:
            r11 = r0
            goto Lc0
        Lb8:
            int r3 = r3 + 1
            r0 = r4
            goto L9c
        Lbc:
            if (r0 != 0) goto Lb6
            r11 = r10[r2]
        Lc0:
            r9.remoteconfig = r11
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            r9.pro = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17086e.<init>(eؙٓۗ, eؘؔ۠, eٟؑٚ):void");
    }

    @Override // defpackage.AbstractC16510e
    public final void ads() {
        C12417e c12417e = this.signatures;
        if (c12417e != null) {
            c12417e.vip();
        }
        this.signatures = null;
        synchronized (this.pro) {
            try {
                C1385e c1385e = this.tapsense;
                if (c1385e != null) {
                    c1385e.ad();
                }
                this.tapsense = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC16510e
    public final InterfaceC16100e advert(InterfaceC12330e interfaceC12330e) {
        return new C6607e(4);
    }

    @Override // defpackage.AbstractC16510e
    public final C6884e applovin(C6884e c6884e, C6884e c6884e2) {
        Size size = this.remoteconfig;
        m4158class(Collections.singletonList(m4245this(size).metrica()));
        C10017e vip = c6884e.vip();
        vip.f19786e = size;
        return vip.ad();
    }

    @Override // defpackage.AbstractC16510e
    public final InterfaceC12438e billing(boolean z, InterfaceC4311e interfaceC4311e) {
        return new C2405e();
    }

    /* renamed from: goto, reason: not valid java name */
    public final C1385e m4243goto(Size size) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        C1385e c1385e = this.tapsense;
        if (c1385e != null) {
            c1385e.ad();
        }
        C1385e c1385e2 = new C1385e(surface, size, this.yandex.advert());
        this.tapsense = c1385e2;
        AbstractC15792e.smaato(c1385e2.appmetrica).ad(new RunnableC7410e(surface, surfaceTexture, 26), AbstractC3062e.billing());
        return c1385e2;
    }

    /* renamed from: native, reason: not valid java name */
    public final void m4244native() {
        m4159interface(C6884e.ad(AbstractC2503e.ad).ad(), null);
    }

    /* renamed from: this, reason: not valid java name */
    public final C16990e m4245this(Size size) {
        C1385e m4243goto;
        synchronized (this.pro) {
            m4243goto = m4243goto(size);
        }
        C12417e c12417e = this.signatures;
        if (c12417e != null) {
            c12417e.vip();
        }
        C12417e c12417e2 = new C12417e(new C15570e(this, size, 1));
        this.signatures = c12417e2;
        C16990e license = C16990e.license(new C2405e(), size);
        license.vip.f20509e = 1;
        license.vip(m4243goto, C14677e.license, -1);
        license.purchase = c12417e2;
        return license;
    }
}
