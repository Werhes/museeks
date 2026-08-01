package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15971e extends ArrayAdapter implements AdapterView.OnItemClickListener {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Drawable f31485e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Drawable f31486e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Drawable f31487e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Drawable f31488e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LayoutInflater f31489e;

    public C15971e(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.f31489e = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
        this.f31487e = AbstractC4628e.purchase(context, obtainStyledAttributes.getResourceId(0, 0));
        this.f31486e = AbstractC4628e.purchase(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f31488e = AbstractC4628e.purchase(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f31485e = AbstractC4628e.purchase(context, obtainStyledAttributes.getResourceId(3, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r0 != null) goto L31;
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto Lc
            android.view.LayoutInflater r8 = r6.f31489e
            r1 = 2131559157(0x7f0d02f5, float:1.874365E38)
            android.view.View r8 = r8.inflate(r1, r9, r0)
        Lc:
            java.lang.Object r7 = r6.getItem(r7)
            eؙِٞ r7 = (defpackage.C6541e) r7
            r9 = 2131362893(0x7f0a044d, float:1.834558E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 2131362891(0x7f0a044b, float:1.8345575E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = r7.license
            r9.setText(r2)
            java.lang.String r2 = r7.appmetrica
            int r3 = r7.startapp
            r4 = 1
            r5 = 2
            if (r3 == r5) goto L33
            if (r3 != r4) goto L45
        L33:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L45
            r3 = 80
            r9.setGravity(r3)
            r1.setVisibility(r0)
            r1.setText(r2)
            goto L54
        L45:
            r0 = 16
            r9.setGravity(r0)
            r9 = 8
            r1.setVisibility(r9)
            java.lang.String r9 = ""
            r1.setText(r9)
        L54:
            boolean r9 = r7.billing
            r8.setEnabled(r9)
            r9 = 2131362892(0x7f0a044c, float:1.8345577E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto Lac
            android.net.Uri r0 = r7.purchase
            if (r0 == 0) goto L90
            android.content.Context r1 = r6.getContext()     // Catch: java.io.IOException -> L7c
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L7c
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch: java.io.IOException -> L7c
            r2 = 0
            android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r1, r2)     // Catch: java.io.IOException -> L7c
            if (r0 == 0) goto L90
            goto La9
        L7c:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to load "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "MediaRouteChooserDialog"
            android.util.Log.w(r2, r0, r1)
        L90:
            int r0 = r7.amazon
            if (r0 == r4) goto La6
            if (r0 == r5) goto La3
            boolean r7 = r7.appmetrica()
            if (r7 == 0) goto La0
            android.graphics.drawable.Drawable r7 = r6.f31485e
        L9e:
            r0 = r7
            goto La9
        La0:
            android.graphics.drawable.Drawable r7 = r6.f31487e
            goto L9e
        La3:
            android.graphics.drawable.Drawable r7 = r6.f31488e
            goto L9e
        La6:
            android.graphics.drawable.Drawable r7 = r6.f31486e
            goto L9e
        La9:
            r9.setImageDrawable(r0)
        Lac:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15971e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return ((C6541e) getItem(i)).billing;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C6541e c6541e = (C6541e) getItem(i);
        ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_chooser_route_progress_bar);
        if (imageView != null && progressBar != null) {
            imageView.setVisibility(8);
            progressBar.setVisibility(0);
        }
        c6541e.advert(true);
    }
}
