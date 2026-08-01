package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.loadAd;
import androidx.recyclerview.widget.startapp;
import java.util.ArrayList;
import java.util.Iterator;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2056e extends startapp {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final LayoutInflater f5345e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ DialogC6738e f5346e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Drawable f5347e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ArrayList f5348e = new ArrayList();

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final Drawable f5349e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Drawable f5350e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Drawable f5351e;

    public C2056e(DialogC6738e dialogC6738e) {
        this.f5346e = dialogC6738e;
        Context context = dialogC6738e.f13934e;
        this.f5345e = LayoutInflater.from(context);
        this.f5351e = AbstractC12992e.appmetrica(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f5350e = AbstractC12992e.appmetrica(context, R.attr.mediaRouteTvIconDrawable);
        this.f5347e = AbstractC12992e.appmetrica(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.f5349e = AbstractC12992e.appmetrica(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        ads();
    }

    public final void ads() {
        ArrayList arrayList = this.f5348e;
        arrayList.clear();
        DialogC6738e dialogC6738e = this.f5346e;
        arrayList.add(new C15206e(dialogC6738e.f13934e.getString(R.string.mr_chooser_title)));
        Iterator it = dialogC6738e.f13933e.iterator();
        while (it.hasNext()) {
            arrayList.add(new C15206e((C6541e) it.next()));
        }
        adcel();
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        return this.f5348e.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r2 != null) goto L25;
     */
    @Override // androidx.recyclerview.widget.startapp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void remoteconfig(androidx.recyclerview.widget.loadAd r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.startapp(r10)
            java.util.ArrayList r1 = r8.f5348e
            java.lang.Object r10 = r1.get(r10)
            eّٕؔ r10 = (defpackage.C15206e) r10
            r1 = 1
            if (r0 == r1) goto L86
            java.lang.String r2 = "RecyclerAdapter"
            r3 = 2
            if (r0 == r3) goto L1a
            java.lang.String r9 = "Cannot bind item to ViewHolder because of wrong view type"
            android.util.Log.w(r2, r9)
            return
        L1a:
            eؗ٘ۙ r9 = (defpackage.C4961e) r9
            java.lang.Object r10 = r10.ad
            eؙِٞ r10 = (defpackage.C6541e) r10
            android.view.View r0 = r9.signatures
            r4 = 0
            r0.setVisibility(r4)
            android.widget.ProgressBar r4 = r9.isVip
            r5 = 4
            r4.setVisibility(r5)
            e٘ۡؕ r4 = new e٘ۡؕ
            r4.<init>(r9, r10)
            r0.setOnClickListener(r4)
            android.widget.TextView r0 = r9.inmobi
            java.lang.String r4 = r10.license
            r0.setText(r4)
            android.widget.ImageView r0 = r9.tapsense
            eًؓۙ r9 = r9.isPro
            android.net.Uri r4 = r10.purchase
            if (r4 == 0) goto L69
            eؙۢۡ r5 = r9.f5346e     // Catch: java.io.IOException -> L57
            android.content.Context r5 = r5.f13934e     // Catch: java.io.IOException -> L57
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.io.IOException -> L57
            java.io.InputStream r5 = r5.openInputStream(r4)     // Catch: java.io.IOException -> L57
            r6 = 0
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r5, r6)     // Catch: java.io.IOException -> L57
            if (r2 == 0) goto L69
            goto L82
        L57:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to load "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.w(r2, r4, r5)
        L69:
            int r2 = r10.amazon
            if (r2 == r1) goto L7f
            if (r2 == r3) goto L7c
            boolean r10 = r10.appmetrica()
            if (r10 == 0) goto L79
            android.graphics.drawable.Drawable r9 = r9.f5349e
        L77:
            r2 = r9
            goto L82
        L79:
            android.graphics.drawable.Drawable r9 = r9.f5351e
            goto L77
        L7c:
            android.graphics.drawable.Drawable r9 = r9.f5347e
            goto L77
        L7f:
            android.graphics.drawable.Drawable r9 = r9.f5350e
            goto L77
        L82:
            r0.setImageDrawable(r2)
            return
        L86:
            eَؑۨ r9 = (defpackage.C9992e) r9
            java.lang.Object r10 = r10.ad
            java.lang.String r10 = r10.toString()
            android.widget.TextView r9 = r9.signatures
            r9.setText(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2056e.remoteconfig(androidx.recyclerview.widget.loadAd, int):void");
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [eَؑۨ, androidx.recyclerview.widget.loadAd] */
    @Override // androidx.recyclerview.widget.startapp
    public final loadAd signatures(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.f5345e;
        if (i != 1) {
            if (i == 2) {
                return new C4961e(this, layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            throw new IllegalStateException();
        }
        View inflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
        ?? loadad = new loadAd(inflate);
        loadad.signatures = (TextView) inflate.findViewById(R.id.mr_picker_header_name);
        return loadad;
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int startapp(int i) {
        return ((C15206e) this.f5348e.get(i)).vip;
    }
}
