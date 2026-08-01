package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.mediarouter.app.OverlayListView;
import androidx.mediarouter.app.ad;
import androidx.mediarouter.app.license;
import androidx.mediarouter.app.metrica;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0290e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ license f2295e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2296e;

    public ViewTreeObserverOnGlobalLayoutListenerC0290e(license licenseVar, boolean z) {
        this.f2295e = licenseVar;
        this.f2296e = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        license licenseVar = this.f2295e;
        licenseVar.f478e.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (licenseVar.f484e) {
            licenseVar.f522e = true;
            return;
        }
        C6541e c6541e = licenseVar.f477e;
        int i2 = licenseVar.f511e.getLayoutParams().height;
        license.subscription(licenseVar.f511e, -1);
        licenseVar.inmobi(licenseVar.advert());
        View decorView = licenseVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(licenseVar.getWindow().getAttributes().width, 1073741824), 0);
        license.subscription(licenseVar.f511e, i2);
        if (!(licenseVar.f508e.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) licenseVar.f508e.getDrawable()).getBitmap()) == null) {
            i = 0;
        } else {
            i = licenseVar.loadAd(bitmap.getWidth(), bitmap.getHeight());
            licenseVar.f508e.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int Signature = licenseVar.Signature(licenseVar.advert());
        int size = licenseVar.f510e.size();
        int size2 = licenseVar.admob() ? DesugarCollections.unmodifiableList(c6541e.tapsense).size() * licenseVar.f492e : 0;
        if (size > 0) {
            size2 += licenseVar.f517e;
        }
        int min = Math.min(size2, licenseVar.f528e);
        if (!licenseVar.f482e) {
            min = 0;
        }
        int max = Math.max(i, min) + Signature;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (licenseVar.f532e.getMeasuredHeight() - licenseVar.f478e.getMeasuredHeight());
        if (i <= 0 || max > height) {
            if (licenseVar.f511e.getMeasuredHeight() + licenseVar.f489e.getLayoutParams().height >= licenseVar.f478e.getMeasuredHeight()) {
                licenseVar.f508e.setVisibility(8);
            }
            max = min + Signature;
            i = 0;
        } else {
            licenseVar.f508e.setVisibility(0);
            license.subscription(licenseVar.f508e, i);
        }
        if (!licenseVar.advert() || max > height) {
            licenseVar.f500e.setVisibility(8);
        } else {
            licenseVar.f500e.setVisibility(0);
        }
        licenseVar.inmobi(licenseVar.f500e.getVisibility() == 0);
        int Signature2 = licenseVar.Signature(licenseVar.f500e.getVisibility() == 0);
        int max2 = Math.max(i, min) + Signature2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        licenseVar.f511e.clearAnimation();
        licenseVar.f489e.clearAnimation();
        licenseVar.f478e.clearAnimation();
        boolean z = this.f2296e;
        if (z) {
            licenseVar.mopub(licenseVar.f511e, Signature2);
            licenseVar.mopub(licenseVar.f489e, min);
            licenseVar.mopub(licenseVar.f478e, height);
        } else {
            license.subscription(licenseVar.f511e, Signature2);
            license.subscription(licenseVar.f489e, min);
            license.subscription(licenseVar.f478e, height);
        }
        license.subscription(licenseVar.f512e, rect.height());
        List unmodifiableList = DesugarCollections.unmodifiableList(c6541e.tapsense);
        if (unmodifiableList.isEmpty()) {
            licenseVar.f510e.clear();
            licenseVar.f514e.notifyDataSetChanged();
            return;
        }
        if (new HashSet(licenseVar.f510e).equals(new HashSet(unmodifiableList))) {
            licenseVar.f514e.notifyDataSetChanged();
            return;
        }
        if (z) {
            OverlayListView overlayListView = licenseVar.f489e;
            metrica metricaVar = licenseVar.f514e;
            hashMap = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i3 = 0; i3 < overlayListView.getChildCount(); i3++) {
                Object item = metricaVar.getItem(firstVisiblePosition + i3);
                View childAt = overlayListView.getChildAt(i3);
                hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            hashMap = null;
        }
        if (z) {
            Context context = licenseVar.f506e;
            OverlayListView overlayListView2 = licenseVar.f489e;
            metrica metricaVar2 = licenseVar.f514e;
            hashMap2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i4 = 0; i4 < overlayListView2.getChildCount(); i4++) {
                Object item2 = metricaVar2.getItem(firstVisiblePosition2 + i4);
                View childAt2 = overlayListView2.getChildAt(i4);
                Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(createBitmap));
                hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
            }
        } else {
            hashMap2 = null;
        }
        ArrayList arrayList = licenseVar.f510e;
        HashSet hashSet = new HashSet(unmodifiableList);
        hashSet.removeAll(arrayList);
        licenseVar.f495e = hashSet;
        HashSet hashSet2 = new HashSet(licenseVar.f510e);
        hashSet2.removeAll(unmodifiableList);
        licenseVar.f526e = hashSet2;
        licenseVar.f510e.addAll(0, licenseVar.f495e);
        licenseVar.f510e.removeAll(licenseVar.f526e);
        licenseVar.f514e.notifyDataSetChanged();
        if (z && licenseVar.f482e) {
            if (licenseVar.f526e.size() + licenseVar.f495e.size() > 0) {
                licenseVar.f489e.setEnabled(false);
                licenseVar.f489e.requestLayout();
                licenseVar.f484e = true;
                licenseVar.f489e.getViewTreeObserver().addOnGlobalLayoutListener(new ad(licenseVar, hashMap, hashMap2));
                return;
            }
        }
        licenseVar.f495e = null;
        licenseVar.f526e = null;
    }
}
