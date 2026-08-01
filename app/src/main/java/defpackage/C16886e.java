package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16886e extends Drawable.ConstantState {
    public int Signature;
    public final C9913e ad;
    public boolean adcel;
    public int admob;
    public boolean ads;
    public boolean advert;
    public int amazon;
    public int applovin;
    public int appmetrica;
    public Drawable[] billing;

    /* renamed from: class, reason: not valid java name */
    public boolean f33089class;
    public ColorStateList crashlytics;
    public PorterDuff.Mode firebase;

    /* renamed from: goto, reason: not valid java name */
    public int[][] f33090goto;
    public int inmobi;

    /* renamed from: interface, reason: not valid java name */
    public boolean f33091interface;
    public int isPro;
    public boolean isVip;
    public int license;
    public int loadAd;
    public int metrica;
    public Rect mopub;

    /* renamed from: native, reason: not valid java name */
    public C14338e f33092native;
    public ColorFilter premium;
    public boolean pro;
    public SparseArray purchase;
    public int remoteconfig;
    public boolean signatures;
    public boolean smaato;
    public boolean startapp;
    public boolean subs;
    public boolean subscription;
    public boolean tapsense;

    /* renamed from: this, reason: not valid java name */
    public C2692e f33093this;
    public Resources vip;
    public int yandex;

    public C16886e(C16886e c16886e, C9913e c9913e, Resources resources) {
        this.startapp = false;
        this.advert = false;
        this.isVip = true;
        this.isPro = 0;
        this.applovin = 0;
        this.ad = c9913e;
        Object obj = null;
        this.vip = resources != null ? resources : c16886e != null ? c16886e.vip : null;
        int i = c16886e != null ? c16886e.metrica : 0;
        int i2 = C9913e.f19555e;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.metrica = i;
        if (c16886e != null) {
            this.license = c16886e.license;
            this.appmetrica = c16886e.appmetrica;
            this.signatures = true;
            this.tapsense = true;
            this.startapp = c16886e.startapp;
            this.advert = c16886e.advert;
            this.isVip = c16886e.isVip;
            this.inmobi = c16886e.inmobi;
            this.isPro = c16886e.isPro;
            this.applovin = c16886e.applovin;
            this.ads = c16886e.ads;
            this.premium = c16886e.premium;
            this.subs = c16886e.subs;
            this.crashlytics = c16886e.crashlytics;
            this.firebase = c16886e.firebase;
            this.f33089class = c16886e.f33089class;
            this.f33091interface = c16886e.f33091interface;
            if (c16886e.metrica == i) {
                if (c16886e.adcel) {
                    this.mopub = c16886e.mopub != null ? new Rect(c16886e.mopub) : null;
                    this.adcel = true;
                }
                if (c16886e.smaato) {
                    this.amazon = c16886e.amazon;
                    this.loadAd = c16886e.loadAd;
                    this.Signature = c16886e.Signature;
                    this.admob = c16886e.admob;
                    this.smaato = true;
                }
            }
            if (c16886e.subscription) {
                this.remoteconfig = c16886e.remoteconfig;
                this.subscription = true;
            }
            if (c16886e.pro) {
                this.pro = true;
            }
            Drawable[] drawableArr = c16886e.billing;
            this.billing = new Drawable[drawableArr.length];
            this.yandex = c16886e.yandex;
            SparseArray sparseArray = c16886e.purchase;
            if (sparseArray != null) {
                this.purchase = sparseArray.clone();
            } else {
                this.purchase = new SparseArray(this.yandex);
            }
            int i3 = this.yandex;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.purchase.put(i4, constantState);
                    } else {
                        this.billing[i4] = drawableArr[i4];
                    }
                }
            }
        } else {
            this.billing = new Drawable[10];
            this.yandex = 0;
        }
        if (c16886e != null) {
            this.f33090goto = c16886e.f33090goto;
        } else {
            this.f33090goto = new int[this.billing.length];
        }
        if (c16886e != null) {
            this.f33093this = c16886e.f33093this;
            this.f33092native = c16886e.f33092native;
        } else {
            this.f33093this = new C2692e(obj);
            this.f33092native = new C14338e(0);
        }
    }

    public final int ad(Drawable drawable) {
        int i = this.yandex;
        if (i >= this.billing.length) {
            int i2 = i + 10;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.billing;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.billing = drawableArr;
            int[][] iArr = new int[i2];
            System.arraycopy(this.f33090goto, 0, iArr, 0, i);
            this.f33090goto = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.ad);
        this.billing[i] = drawable;
        this.yandex++;
        this.appmetrica = drawable.getChangingConfigurations() | this.appmetrica;
        this.subscription = false;
        this.pro = false;
        this.mopub = null;
        this.adcel = false;
        this.smaato = false;
        this.signatures = false;
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final int appmetrica(int i) {
        ?? r5;
        if (i < 0) {
            return 0;
        }
        C14338e c14338e = this.f33092native;
        int i2 = 0;
        int metrica = AbstractC10115e.metrica(c14338e.f28363e, i, c14338e.f28365e);
        if (metrica >= 0 && (r5 = c14338e.f28364e[metrica]) != AbstractC5092e.ad) {
            i2 = r5;
        }
        return i2.intValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.yandex;
        Drawable[] drawableArr = this.billing;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.purchase.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.license | this.appmetrica;
    }

    public final Drawable license(int i) {
        int indexOfKey;
        Drawable drawable = this.billing[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.purchase;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.purchase.valueAt(indexOfKey)).newDrawable(this.vip);
        newDrawable.setLayoutDirection(this.inmobi);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.ad);
        this.billing[i] = mutate;
        this.purchase.removeAt(indexOfKey);
        if (this.purchase.size() == 0) {
            this.purchase = null;
        }
        return mutate;
    }

    public final void metrica() {
        SparseArray sparseArray = this.purchase;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.purchase.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.purchase.valueAt(i);
                Drawable[] drawableArr = this.billing;
                Drawable newDrawable = constantState.newDrawable(this.vip);
                newDrawable.setLayoutDirection(this.inmobi);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.ad);
                drawableArr[keyAt] = mutate;
            }
            this.purchase = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C9913e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C9913e(this, resources);
    }

    public final int purchase(int[] iArr) {
        int[][] iArr2 = this.f33090goto;
        int i = this.yandex;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    public final void vip() {
        this.smaato = true;
        metrica();
        int i = this.yandex;
        Drawable[] drawableArr = this.billing;
        this.loadAd = -1;
        this.amazon = -1;
        this.admob = 0;
        this.Signature = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.amazon) {
                this.amazon = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.loadAd) {
                this.loadAd = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.Signature) {
                this.Signature = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.admob) {
                this.admob = minimumHeight;
            }
        }
    }
}
