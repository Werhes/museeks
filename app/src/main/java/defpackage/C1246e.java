package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.adcel;
import androidx.recyclerview.widget.loadAd;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1246e extends AbstractC6238e implements InterfaceC3602e {
    public float adcel;
    public int admob;
    public Rect ads;
    public float appmetrica;
    public float billing;
    public GestureDetector inmobi;
    public C9986e isPro;
    public float license;
    public int loadAd;
    public float mopub;
    public long premium;
    public VelocityTracker pro;
    public float purchase;
    public ArrayList signatures;
    public final C11294e smaato;
    public float startapp;
    public RecyclerView subscription;
    public ArrayList tapsense;
    public float yandex;
    public final ArrayList ad = new ArrayList();
    public final float[] vip = new float[2];
    public loadAd metrica = null;
    public int advert = -1;
    public int amazon = 0;
    public final ArrayList Signature = new ArrayList();
    public final RunnableC12991e remoteconfig = new RunnableC12991e(15, this);
    public View isVip = null;
    public final C9583e applovin = new C9583e(this);

    public C1246e(C11294e c11294e) {
        this.smaato = c11294e;
    }

    public static boolean smaato(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x008f, code lost:
    
        if (r8 > 0) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ec  */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Signature(androidx.recyclerview.widget.loadAd r20, int r21) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1246e.Signature(androidx.recyclerview.widget.loadAd, int):void");
    }

    public final void adcel(loadAd loadad, boolean z) {
        ArrayList arrayList = this.Signature;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C11616e c11616e = (C11616e) arrayList.get(size);
            if (c11616e.appmetrica == loadad) {
                c11616e.mopub |= z;
                if (!c11616e.advert) {
                    c11616e.billing.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final void admob(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.license;
        this.yandex = f;
        this.startapp = y - this.appmetrica;
        if ((i & 4) == 0) {
            this.yandex = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.yandex = Math.min(0.0f, this.yandex);
        }
        if ((i & 1) == 0) {
            this.startapp = Math.max(0.0f, this.startapp);
        }
        if ((i & 2) == 0) {
            this.startapp = Math.min(0.0f, this.startapp);
        }
    }

    public final void advert(float[] fArr) {
        if ((this.loadAd & 12) != 0) {
            fArr[0] = (this.adcel + this.yandex) - this.metrica.ad.getLeft();
        } else {
            fArr[0] = this.metrica.ad.getTranslationX();
        }
        if ((this.loadAd & 3) != 0) {
            fArr[1] = (this.mopub + this.startapp) - this.metrica.ad.getTop();
        } else {
            fArr[1] = this.metrica.ad.getTranslationY();
        }
    }

    public final void amazon(loadAd loadad) {
        ArrayList arrayList;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i;
        int i2;
        int i3;
        int i4;
        if (!this.subscription.isLayoutRequested() && this.amazon == 2) {
            C11294e c11294e = this.smaato;
            c11294e.getClass();
            int i5 = (int) (this.adcel + this.yandex);
            int i6 = (int) (this.mopub + this.startapp);
            View view = loadad.ad;
            if (Math.abs(i6 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i5 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.signatures;
                if (arrayList2 == null) {
                    this.signatures = new ArrayList();
                    this.tapsense = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.tapsense.clear();
                }
                int round = Math.round(this.adcel + this.yandex);
                int round2 = Math.round(this.mopub + this.startapp);
                int width = view.getWidth() + round;
                int height = view.getHeight() + round2;
                int i7 = (round + width) / 2;
                int i8 = (round2 + height) / 2;
                adcel layoutManager = this.subscription.getLayoutManager();
                int tapsense = layoutManager.tapsense();
                int i9 = 0;
                while (i9 < tapsense) {
                    View signatures = layoutManager.signatures(i9);
                    if (signatures == view) {
                        i = i9;
                    } else {
                        i = i9;
                        if (signatures.getBottom() >= round2 && signatures.getTop() <= height && signatures.getRight() >= round && signatures.getLeft() <= width) {
                            loadAd childViewHolder = this.subscription.getChildViewHolder(signatures);
                            i2 = i5;
                            Object obj = this.metrica.remoteconfig;
                            i3 = i6;
                            if ((obj instanceof InterfaceC9392e) && (childViewHolder.remoteconfig instanceof InterfaceC9392e) && ((InterfaceC9392e) obj).metrica() && ((InterfaceC9392e) childViewHolder.remoteconfig).metrica()) {
                                int abs5 = Math.abs(i7 - ((signatures.getRight() + signatures.getLeft()) / 2));
                                int abs6 = Math.abs(i8 - ((signatures.getBottom() + signatures.getTop()) / 2));
                                int i10 = (abs6 * abs6) + (abs5 * abs5);
                                int size = this.signatures.size();
                                i4 = round;
                                int i11 = 0;
                                int i12 = 0;
                                while (i12 < size) {
                                    int i13 = size;
                                    if (i10 <= ((Integer) this.tapsense.get(i12)).intValue()) {
                                        break;
                                    }
                                    i11++;
                                    i12++;
                                    size = i13;
                                }
                                this.signatures.add(i11, childViewHolder);
                                this.tapsense.add(i11, Integer.valueOf(i10));
                                i9 = i + 1;
                                i5 = i2;
                                i6 = i3;
                                round = i4;
                            }
                            i4 = round;
                            i9 = i + 1;
                            i5 = i2;
                            i6 = i3;
                            round = i4;
                        }
                    }
                    i2 = i5;
                    i3 = i6;
                    i4 = round;
                    i9 = i + 1;
                    i5 = i2;
                    i6 = i3;
                    round = i4;
                }
                int i14 = i5;
                int i15 = i6;
                ArrayList arrayList3 = this.signatures;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i14;
                int height2 = view.getHeight() + i15;
                int left2 = i14 - view.getLeft();
                int top2 = i15 - view.getTop();
                int size2 = arrayList3.size();
                loadAd loadad2 = null;
                int i16 = -1;
                int i17 = 0;
                while (i17 < size2) {
                    loadAd loadad3 = (loadAd) arrayList3.get(i17);
                    if (left2 <= 0 || (right = loadad3.ad.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (loadad3.ad.getRight() > view.getRight() && (abs4 = Math.abs(right)) > i16) {
                            i16 = abs4;
                            loadad2 = loadad3;
                        }
                    }
                    if (left2 < 0 && (left = loadad3.ad.getLeft() - i14) > 0 && loadad3.ad.getLeft() < view.getLeft() && (abs3 = Math.abs(left)) > i16) {
                        i16 = abs3;
                        loadad2 = loadad3;
                    }
                    if (top2 < 0 && (top = loadad3.ad.getTop() - i15) > 0 && loadad3.ad.getTop() < view.getTop() && (abs2 = Math.abs(top)) > i16) {
                        i16 = abs2;
                        loadad2 = loadad3;
                    }
                    if (top2 > 0 && (bottom = loadad3.ad.getBottom() - height2) < 0 && loadad3.ad.getBottom() > view.getBottom() && (abs = Math.abs(bottom)) > i16) {
                        i16 = abs;
                        loadad2 = loadad3;
                    }
                    i17++;
                    arrayList3 = arrayList;
                }
                if (loadad2 == null) {
                    this.signatures.clear();
                    this.tapsense.clear();
                    return;
                }
                View view2 = loadad2.ad;
                int vip = loadad2.vip();
                loadad.vip();
                if (loadad.purchase != loadad2.purchase) {
                    return;
                }
                c11294e.appmetrica = loadad.metrica();
                int metrica = loadad2.metrica();
                c11294e.purchase = metrica;
                if (c11294e.license == -1) {
                    c11294e.license = c11294e.appmetrica;
                }
                ((InterfaceC9392e) loadad.remoteconfig).vip(c11294e.appmetrica, metrica);
                RecyclerView recyclerView = this.subscription;
                adcel layoutManager2 = recyclerView.getLayoutManager();
                if (!(layoutManager2 instanceof LinearLayoutManager)) {
                    if (layoutManager2.license()) {
                        if (adcel.ads(view2) <= recyclerView.getPaddingLeft()) {
                            recyclerView.scrollToPosition(vip);
                        }
                        if (adcel.crashlytics(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.scrollToPosition(vip);
                        }
                    }
                    if (layoutManager2.appmetrica()) {
                        if (adcel.firebase(view2) <= recyclerView.getPaddingTop()) {
                            recyclerView.scrollToPosition(vip);
                        }
                        if (adcel.isPro(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.scrollToPosition(vip);
                            return;
                        }
                        return;
                    }
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                linearLayoutManager.metrica("Cannot drop a view during a scroll or layout calculation");
                linearLayoutManager.m95e();
                linearLayoutManager.m99e();
                int m145extends = adcel.m145extends(view);
                int m145extends2 = adcel.m145extends(view2);
                char c = m145extends < m145extends2 ? (char) 1 : (char) 65535;
                if (linearLayoutManager.signatures) {
                    if (c == 1) {
                        linearLayoutManager.m87e(m145extends2, linearLayoutManager.subscription.billing() - (linearLayoutManager.subscription.metrica(view) + linearLayoutManager.subscription.appmetrica(view2)));
                        return;
                    } else {
                        linearLayoutManager.m87e(m145extends2, linearLayoutManager.subscription.billing() - linearLayoutManager.subscription.vip(view2));
                        return;
                    }
                }
                if (c == 65535) {
                    linearLayoutManager.m87e(m145extends2, linearLayoutManager.subscription.appmetrica(view2));
                } else {
                    linearLayoutManager.m87e(m145extends2, linearLayoutManager.subscription.vip(view2) - linearLayoutManager.subscription.metrica(view));
                }
            }
        }
    }

    @Override // defpackage.AbstractC6238e
    public final void appmetrica(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.metrica != null) {
            float[] fArr = this.vip;
            advert(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        loadAd loadad = this.metrica;
        this.smaato.getClass();
        ArrayList arrayList = this.Signature;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C11616e c11616e = (C11616e) arrayList.get(i);
            loadAd loadad2 = c11616e.appmetrica;
            float f3 = c11616e.ad;
            float f4 = c11616e.metrica;
            if (f3 == f4) {
                c11616e.startapp = loadad2.ad.getTranslationX();
            } else {
                c11616e.startapp = AbstractC1634e.billing(f4, f3, c11616e.smaato, f3);
            }
            float f5 = c11616e.vip;
            float f6 = c11616e.license;
            if (f5 == f6) {
                c11616e.adcel = loadad2.ad.getTranslationY();
            } else {
                c11616e.adcel = AbstractC1634e.billing(f6, f5, c11616e.smaato, f5);
            }
            int save = canvas.save();
            C11294e.purchase(recyclerView, c11616e.appmetrica, c11616e.startapp, c11616e.adcel, false);
            canvas.restoreToCount(save);
        }
        if (loadad != null) {
            int save2 = canvas.save();
            C11294e.purchase(recyclerView, loadad, f, f2, true);
            canvas.restoreToCount(save2);
        }
    }

    public final int billing(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.yandex > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.pro;
        C11294e c11294e = this.smaato;
        if (velocityTracker != null && this.advert > -1) {
            float f = this.billing;
            c11294e.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.pro.getXVelocity(this.advert);
            float yVelocity = this.pro.getYVelocity(this.advert);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.purchase && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.subscription.getWidth();
        c11294e.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.yandex) <= f2) {
            return 0;
        }
        return i2;
    }

    @Override // defpackage.AbstractC6238e
    public final void license(Rect rect, View view, RecyclerView recyclerView) {
        rect.setEmpty();
    }

    public final void loadAd(View view) {
        if (view == this.isVip) {
            this.isVip = null;
        }
    }

    public final View mopub(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        loadAd loadad = this.metrica;
        if (loadad != null) {
            View view = loadad.ad;
            if (smaato(view, x, y, this.adcel + this.yandex, this.mopub + this.startapp)) {
                return view;
            }
        }
        ArrayList arrayList = this.Signature;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C11616e c11616e = (C11616e) arrayList.get(size);
            View view2 = c11616e.appmetrica.ad;
            if (smaato(view2, x, y, c11616e.startapp, c11616e.adcel)) {
                return view2;
            }
        }
        return this.subscription.findChildViewUnder(x, y);
    }

    @Override // defpackage.AbstractC6238e
    public final void purchase(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.metrica != null) {
            float[] fArr = this.vip;
            advert(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        loadAd loadad = this.metrica;
        this.smaato.getClass();
        ArrayList arrayList = this.Signature;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C11616e c11616e = (C11616e) arrayList.get(i);
            int save = canvas.save();
            View view = c11616e.appmetrica.ad;
            canvas.restoreToCount(save);
        }
        if (loadad != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C11616e c11616e2 = (C11616e) arrayList.get(i2);
            boolean z2 = c11616e2.advert;
            if (z2 && !c11616e2.yandex) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final int startapp(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.startapp > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.pro;
        C11294e c11294e = this.smaato;
        if (velocityTracker != null && this.advert > -1) {
            float f = this.billing;
            c11294e.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.pro.getXVelocity(this.advert);
            float yVelocity = this.pro.getYVelocity(this.advert);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.purchase && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.subscription.getHeight();
        c11294e.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.startapp) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void yandex(int i, int i2, MotionEvent motionEvent) {
        View mopub;
        if (this.metrica == null && i == 2 && this.amazon != 2) {
            C11294e c11294e = this.smaato;
            c11294e.getClass();
            if (this.subscription.getScrollState() == 1) {
                return;
            }
            adcel layoutManager = this.subscription.getLayoutManager();
            int i3 = this.advert;
            loadAd loadad = null;
            if (i3 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(findPointerIndex) - this.license;
                float y = motionEvent.getY(findPointerIndex) - this.appmetrica;
                float abs = Math.abs(x);
                float abs2 = Math.abs(y);
                float f = this.admob;
                if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !layoutManager.license()) && ((abs2 <= abs || !layoutManager.appmetrica()) && (mopub = mopub(motionEvent)) != null))) {
                    loadad = this.subscription.getChildViewHolder(mopub);
                }
            }
            if (loadad == null) {
                return;
            }
            int vip = (C11294e.vip(c11294e.license(loadad), this.subscription.getLayoutDirection()) & 65280) >> 8;
            if (vip == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f2 = x2 - this.license;
            float f3 = y2 - this.appmetrica;
            float abs3 = Math.abs(f2);
            float abs4 = Math.abs(f3);
            float f4 = this.admob;
            if (abs3 >= f4 || abs4 >= f4) {
                if (abs3 > abs4) {
                    if (f2 < 0.0f && (vip & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (vip & 8) == 0) {
                        return;
                    }
                } else {
                    if (f3 < 0.0f && (vip & 1) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (vip & 2) == 0) {
                        return;
                    }
                }
                this.startapp = 0.0f;
                this.yandex = 0.0f;
                this.advert = motionEvent.getPointerId(0);
                Signature(loadad, 1);
            }
        }
    }
}
