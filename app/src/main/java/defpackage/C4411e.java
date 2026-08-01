package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4411e extends ContextWrapper {
    public static Configuration purchase;
    public int ad;
    public Resources appmetrica;
    public Configuration license;
    public LayoutInflater metrica;
    public Resources.Theme vip;

    public C4411e(Context context, int i) {
        super(context);
        this.ad = i;
    }

    public final void ad(Configuration configuration) {
        if (this.appmetrica != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.license != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.license = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(defpackage.C4411e.purchase) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.appmetrica
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.license
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = defpackage.C4411e.purchase
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            defpackage.C4411e.purchase = r1
        L1c:
            android.content.res.Configuration r1 = defpackage.C4411e.purchase
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.license
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.appmetrica = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.appmetrica = r0
        L38:
            android.content.res.Resources r0 = r3.appmetrica
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4411e.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.metrica == null) {
            this.metrica = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.metrica;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.vip;
        if (theme != null) {
            return theme;
        }
        if (this.ad == 0) {
            this.ad = R.style.Theme_AppCompat_Light;
        }
        vip();
        return this.vip;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.ad != i) {
            this.ad = i;
            vip();
        }
    }

    public final void vip() {
        if (this.vip == null) {
            this.vip = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.vip.setTo(theme);
            }
        }
        this.vip.applyStyle(this.ad, true);
    }
}
