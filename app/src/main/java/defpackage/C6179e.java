package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6179e extends AbstractC7214e {
    public final /* synthetic */ AbstractC1802e license;
    public final /* synthetic */ int metrica;

    public /* synthetic */ C6179e(AbstractC1802e abstractC1802e, int i) {
        this.metrica = i;
        this.license = abstractC1802e;
    }

    @Override // defpackage.AbstractC7214e
    public final void adcel(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.metrica) {
            case 0:
                ((BottomSheetBehavior) this.license).tapsense(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.license;
                WeakReference weakReference = sideSheetBehavior.admob;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    C7582e c7582e = sideSheetBehavior.ad;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (c7582e.ad) {
                        case 0:
                            if (left <= c7582e.vip.smaato) {
                                marginLayoutParams.leftMargin = right;
                                break;
                            }
                            break;
                        default:
                            int i3 = c7582e.vip.smaato;
                            if (left <= i3) {
                                marginLayoutParams.rightMargin = i3 - left;
                                break;
                            }
                            break;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.signatures;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                C7582e c7582e2 = sideSheetBehavior.ad;
                switch (c7582e2.ad) {
                    case 0:
                        c7582e2.startapp();
                        c7582e2.yandex();
                        break;
                    default:
                        int i4 = c7582e2.vip.smaato;
                        c7582e2.yandex();
                        break;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC5087e.m1747goto(it);
                }
                return;
        }
    }

    @Override // defpackage.AbstractC7214e
    public int appmetrica(View view) {
        switch (this.metrica) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.license;
                return sideSheetBehavior.advert + sideSheetBehavior.loadAd;
            default:
                return super.appmetrica(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r6.canScrollVertically(-1) != false) goto L36;
     */
    @Override // defpackage.AbstractC7214e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean loadAd(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.metrica
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            eؓٓٞ r6 = r4.license
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.yandex
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r6 = r6.Signature
            if (r6 == 0) goto L1b
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            eؓٓٞ r0 = r4.license
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.f798throw
            r2 = 1
            if (r1 != r2) goto L26
            goto L56
        L26:
            boolean r3 = r0.f792package
            if (r3 == 0) goto L2b
            goto L56
        L2b:
            r3 = 3
            if (r1 != r3) goto L48
            int r1 = r0.f795strictfp
            if (r1 != r6) goto L48
            java.lang.ref.WeakReference r6 = r0.f784final
            if (r6 == 0) goto L3d
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L3e
        L3d:
            r6 = 0
        L3e:
            if (r6 == 0) goto L48
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L48
            goto L56
        L48:
            java.lang.System.currentTimeMillis()
            java.lang.ref.WeakReference r6 = r0.f780catch
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6179e.loadAd(android.view.View, int):boolean");
    }

    @Override // defpackage.AbstractC7214e
    public final int metrica(View view, int i) {
        switch (this.metrica) {
            case 0:
                return AbstractC13482e.mopub(i, ((BottomSheetBehavior) this.license).isPro(), purchase());
            default:
                return view.getTop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r2 > 0.5f) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if (java.lang.Math.abs(r7) > 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        if (r6.getLeft() > ((r7.yandex() + r7.vip.smaato) / 2)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b5, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        if (r7 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        if (r6.getRight() < ((r7.yandex() - r7.startapp()) / 2)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
    
        if (java.lang.Math.abs(r7) > 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        if (java.lang.Math.abs(r7 - r0.ad.yandex()) < java.lang.Math.abs(r7 - r0.ad.startapp())) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0044, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x005c, code lost:
    
        if (r2 > 0.5f) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0017, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x001c, code lost:
    
        if (r7 > 0.0f) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
    
        if (r7 > r0.firebase) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r7 < 0.0f) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0173, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r0.isPro()) < java.lang.Math.abs(r6.getTop() - r0.firebase)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01be, code lost:
    
        if (java.lang.Math.abs(r7 - r0.crashlytics) < java.lang.Math.abs(r7 - r0.f789interface)) goto L65;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0027. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0065. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    @Override // defpackage.AbstractC7214e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mopub(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6179e.mopub(android.view.View, float, float):void");
    }

    @Override // defpackage.AbstractC7214e
    public int purchase() {
        switch (this.metrica) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.license;
                return bottomSheetBehavior.f797this ? bottomSheetBehavior.f779case : bottomSheetBehavior.f789interface;
            default:
                return super.purchase();
        }
    }

    @Override // defpackage.AbstractC7214e
    public final void startapp(int i) {
        switch (this.metrica) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.license;
                    if (bottomSheetBehavior.f783extends) {
                        bottomSheetBehavior.firebase(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.license;
                    if (sideSheetBehavior.billing) {
                        sideSheetBehavior.remoteconfig(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.AbstractC7214e
    public final int vip(View view, int i) {
        int i2;
        int i3;
        switch (this.metrica) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.license;
                C7582e c7582e = sideSheetBehavior.ad;
                switch (c7582e.ad) {
                    case 0:
                        i2 = -c7582e.vip.advert;
                        break;
                    default:
                        i2 = c7582e.yandex();
                        break;
                }
                C7582e c7582e2 = sideSheetBehavior.ad;
                switch (c7582e2.ad) {
                    case 0:
                        i3 = c7582e2.vip.loadAd;
                        break;
                    default:
                        i3 = c7582e2.vip.smaato;
                        break;
                }
                return AbstractC13482e.mopub(i, i2, i3);
        }
    }
}
