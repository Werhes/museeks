package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۘۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12701e implements AutoCloseable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C4760e f25436e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final InterfaceC18435e f25437e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C12714e f25438e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C2107e f25439e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C9003e f25440e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C11087e f25441e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C9823e f25442e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C2673e f25443e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C9173e f25444e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C2866e f25445e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C14233e f25446e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C13783e f25447e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C9823e f25448e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C5157e f25449e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C7864e f25450e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List, java.util.Collection] */
    public C12701e(C9485e c9485e, InterfaceC2531e interfaceC2531e, C9823e c9823e, C9823e c9823e2, C2107e c2107e, C14233e c14233e, C4760e c4760e, C7864e c7864e, C5157e c5157e, C9173e c9173e, C13783e c13783e, C9003e c9003e, C2866e c2866e, C12714e c12714e, InterfaceC18435e interfaceC18435e, C11087e c11087e) {
        String str;
        Object obj;
        Iterator it;
        ArrayList arrayList = c9485e.license;
        int i = c9485e.yandex;
        Object obj2 = c2107e.f5450e;
        this.f25448e = c9823e;
        this.f25442e = c9823e2;
        this.f25439e = c2107e;
        this.f25446e = c14233e;
        this.f25436e = c4760e;
        this.f25450e = c7864e;
        this.f25449e = c5157e;
        this.f25444e = c9173e;
        this.f25447e = c13783e;
        this.f25440e = c9003e;
        this.f25445e = c2866e;
        this.f25438e = c12714e;
        this.f25437e = interfaceC18435e;
        this.f25441e = c11087e;
        this.f25443e = AbstractC14430e.metrica(false);
        String str2 = c9485e.ad;
        C9000e c9000e = (C9000e) interfaceC2531e;
        Integer num = (Integer) c9000e.metrica(CameraCharacteristics.LENS_FACING);
        String str3 = "External";
        String str4 = "Unknown";
        String str5 = (num != null && num.intValue() == 0) ? "Front" : (num != null && num.intValue() == 1) ? "Back" : (num != null && num.intValue() == 2) ? "External" : "Unknown";
        Integer num2 = (Integer) c9000e.metrica(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num2 != null && num2.intValue() == 0) {
            str3 = "Limited";
        } else if (num2 != null && num2.intValue() == 1) {
            str3 = "Full";
        } else if (num2 != null && num2.intValue() == 2) {
            str3 = "Legacy";
        } else if (num2 != null && num2.intValue() == 3) {
            str3 = "Level 3";
        } else if (num2 == null || num2.intValue() != 4) {
            str3 = "Unknown";
        }
        if (i == 1) {
            str4 = "High Speed";
        } else if (i == 0) {
            str4 = "Normal";
        } else if (i == 2) {
            str4 = "Extension";
        }
        int[] iArr = (int[]) c9000e.metrica(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        String str6 = (iArr == null || !AbstractC1660e.startapp(iArr, 11)) ? "Physical" : "Logical";
        StringBuilder sb = new StringBuilder();
        sb.append(this + " (Camera " + str2 + ")\n");
        StringBuilder tapsense = AbstractC17861e.tapsense("  Facing:    ", str5, " (", str6, ", ");
        tapsense.append(str3);
        tapsense.append(")\n");
        sb.append(tapsense.toString());
        sb.append("  Mode:      " + str4 + '\n');
        sb.append("Outputs:\n");
        Iterator it2 = c2107e.f5449e.iterator();
        while (true) {
            int i2 = 12;
            if (!it2.hasNext()) {
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                ?? r16 = obj2;
                if (!r16.isEmpty()) {
                    sb.append("Inputs:\n");
                    for (C0449e c0449e : r16) {
                        sb.append(" ");
                        sb.append(AbstractC5304e.m1851break(12, "Input-" + c0449e.ad));
                        sb.append(AbstractC5304e.m1851break(12, C0299e.vip(c0449e.vip)));
                        sb.append(AbstractC5304e.m1851break(12, String.valueOf(1)));
                        sb.append("\n");
                    }
                }
                sb.append("Session Template: " + C18217e.ad(c9485e.purchase) + '\n');
                AbstractC2641e.vip(sb, "Session Parameters", c9485e.billing);
                sb.append("Default Template: " + C18217e.ad(c9485e.startapp) + '\n');
                AbstractC2641e.vip(sb, "Default Parameters", c9485e.adcel);
                AbstractC2641e.vip(sb, "Required Parameters", c9485e.smaato);
                Log.i("CXCP", sb.toString());
                if (i3 == 1) {
                    if (this.f25439e.f5446e.isEmpty()) {
                        throw new IllegalArgumentException("Cannot create a HIGH_SPEED CameraGraph without outputs.");
                    }
                    if (this.f25439e.f5446e.size() > 2) {
                        throw new IllegalArgumentException(("Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are " + this.f25439e.f5446e).toString());
                    }
                    ArrayList arrayList3 = this.f25439e.f5446e;
                    if (arrayList3 == null || !arrayList3.isEmpty()) {
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            if (!((C7662e) it3.next()).ad()) {
                                throw new IllegalArgumentException(("HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are " + this.f25439e.f5446e).toString());
                            }
                        }
                    }
                }
                if (arrayList2 != null) {
                    if (arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("At least one InputConfiguration is required for reprocessing");
                    }
                    if (Build.VERSION.SDK_INT < 31 && arrayList2.size() > 1) {
                        throw new IllegalArgumentException("Multi resolution reprocessing not supported under Android S");
                    }
                }
                if (this.f25439e.f5443e.isEmpty()) {
                    return;
                }
                this.f25446e.ad();
                return;
            }
            Iterator it4 = ((C12550e) it2.next()).vip.iterator();
            int i4 = 0;
            while (it4.hasNext()) {
                Object next = it4.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    AbstractC6874e.Signature();
                    throw null;
                }
                C7662e c7662e = (C7662e) next;
                sb.append("  ");
                if (i4 == 0) {
                    C12550e c12550e = c7662e.adcel;
                    str = C13269e.ad((c12550e != null ? c12550e : null).ad);
                } else {
                    str = BuildConfig.FLAVOR;
                }
                sb.append(AbstractC5304e.m1851break(i2, str));
                sb.append(AbstractC5304e.m1851break(i2, C18319e.ad(c7662e.ad)));
                String str7 = c7662e.license;
                sb.append(AbstractC5304e.m1851break(i2, c7662e.vip.toString()));
                sb.append(AbstractC5304e.m1851break(16, C0299e.ad(c7662e.metrica)));
                C17560e c17560e = c7662e.appmetrica;
                if (c17560e != null) {
                    sb.append(" [" + ((Object) C17560e.ad(c17560e.ad)) + ']');
                }
                C8487e c8487e = c7662e.purchase;
                Iterator it5 = it2;
                ArrayList arrayList4 = arrayList;
                if (c8487e != null) {
                    sb.append(" [" + ((Object) C8487e.ad(c8487e.ad)) + ']');
                }
                C8469e c8469e = c7662e.billing;
                int i6 = i;
                if (c8469e != null) {
                    long j = c8469e.ad;
                    StringBuilder sb2 = new StringBuilder(" [");
                    obj = obj2;
                    it = it4;
                    sb2.append((Object) ("StreamUseCase(value=" + j + ')'));
                    sb2.append(']');
                    sb.append(sb2.toString());
                } else {
                    obj = obj2;
                    it = it4;
                }
                C4996e c4996e = c7662e.startapp;
                if (c4996e != null) {
                    long j2 = c4996e.ad;
                    StringBuilder sb3 = new StringBuilder(" [");
                    sb3.append((Object) ("StreamUseHint(value=" + j2 + ')'));
                    sb3.append(']');
                    sb.append(sb3.toString());
                }
                if (!AbstractC7890e.billing(str7, str2)) {
                    sb.append(" [");
                    sb.append(new C5060e(str7));
                    sb.append("]");
                }
                sb.append("\n");
                it2 = it5;
                it4 = it;
                i = i6;
                i4 = i5;
                arrayList = arrayList4;
                obj2 = obj;
                i2 = 12;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.AbstractC10731e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C15840e
            if (r0 == 0) goto L13
            r0 = r7
            eٕۥُ r0 = (defpackage.C15840e) r0
            int r1 = r0.f31264e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31264e = r1
            goto L18
        L13:
            eٕۥُ r0 = new eٕۥُ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f31263e
            int r1 = r0.f31264e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r7)
            goto L3d
        L25:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2d:
            defpackage.AbstractC2003e.purchase(r7)
            r0.f31264e = r2
            eٌّۙ r7 = r6.f25438e
            java.lang.Object r7 = r7.ad(r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r7 != r0) goto L3d
            return r0
        L3d:
            r1 = r7
            eٍؚْ r1 = (defpackage.C13155e) r1
            eٕؐۤ r0 = new eٕؐۤ
            eٌؚ۟ r4 = r6.f25440e
            eؔۛۦ r5 = r6.f25445e
            eٍۡۛ r2 = r6.f25448e
            eُٚؕ r3 = r6.f25441e
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12701e.ad(eُؑ۠):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f25443e.ad()) {
            Trace.beginSection(this + "#close");
            StringBuilder sb = new StringBuilder("Closing ");
            sb.append(this);
            Log.i("CXCP", sb.toString());
            this.f25448e.vip.close();
            C4760e c4760e = this.f25436e;
            synchronized (c4760e.Signature) {
                try {
                    if (!c4760e.purchase()) {
                        c4760e.subscription = C9014e.loadAd;
                        Log.d("CXCP", "Closed " + c4760e);
                        C0216e c0216e = c4760e.inmobi;
                        C13135e c13135e = c4760e.isPro;
                        c4760e.inmobi = null;
                        c4760e.isPro = null;
                        C8419e c8419e = c4760e.tapsense;
                        if (c8419e != null) {
                            c8419e.Signature(null);
                        }
                        C8419e c8419e2 = c4760e.ads;
                        if (c8419e2 != null) {
                            c8419e2.Signature(null);
                        }
                        c4760e.ads = null;
                        C8419e c8419e3 = c4760e.premium;
                        if (c8419e3 != null) {
                            c8419e3.Signature(null);
                        }
                        c4760e.premium = null;
                        C8419e c8419e4 = c4760e.subs;
                        if (c8419e4 != null) {
                            c8419e4.Signature(null);
                        }
                        c4760e.subs = null;
                        AbstractC10257e.remoteconfig(c4760e.purchase);
                        c4760e.appmetrica(c13135e, c0216e);
                        C9485e c9485e = c4760e.metrica;
                        if (c9485e.loadAd.appmetrica || c4760e.mopub.ad(c9485e.ad)) {
                            Log.d("CXCP", "Quirk: Closing " + ((Object) C5060e.vip(c4760e.metrica.ad)) + " during " + c4760e + "#close");
                            c4760e.startapp.ad(c4760e.metrica.ad);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f25450e.close();
            this.f25449e.close();
            this.f25446e.close();
            this.f25439e.close();
            this.f25444e.license(this);
            AbstractC9743e.license(this.f25437e, null);
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void license(int r8, android.view.Surface r9) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12701e.license(int, android.view.Surface):void");
    }

    public final void purchase() {
        if (this.f25443e.vip()) {
            throw new IllegalStateException(("Cannot start " + this + " after calling close()").toString());
        }
        Trace.beginSection(this + "#start");
        StringBuilder sb = new StringBuilder("Starting ");
        sb.append(this);
        Log.i("CXCP", sb.toString());
        C9823e c9823e = this.f25442e;
        c9823e.getClass();
        Log.d("CXCP", c9823e + " onGraphStarting");
        C1615e c1615e = c9823e.license;
        C4186e c4186e = C4186e.metrica;
        c1615e.getClass();
        c1615e.smaato(null, c4186e);
        for (C5373e c5373e : c9823e.metrica) {
            C5241e c5241e = c5373e.ad;
            C12701e c12701e = c5373e.vip;
            if (c12701e == null) {
                c12701e = null;
            }
            c5241e.vip(c12701e, c4186e);
        }
        C4760e c4760e = this.f25436e;
        synchronized (c4760e.Signature) {
            c4760e.billing();
            Unit unit = Unit.INSTANCE;
        }
        Trace.endSection();
    }

    public final String toString() {
        return this.f25447e.ad;
    }
}
