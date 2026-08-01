package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13911e implements InterfaceC1016e, InterfaceC8856e {
    public final /* synthetic */ int ad = 0;
    public Uri appmetrica;
    public int license;
    public int metrica;
    public Bundle purchase;
    public ClipData vip;

    public /* synthetic */ C13911e() {
    }

    public C13911e(C13911e c13911e) {
        ClipData clipData = c13911e.vip;
        clipData.getClass();
        this.vip = clipData;
        int i = c13911e.metrica;
        AbstractC4265e.appmetrica(i, 0, 5, "source");
        this.metrica = i;
        int i2 = c13911e.license;
        if ((i2 & 1) == i2) {
            this.license = i2;
            this.appmetrica = c13911e.appmetrica;
            this.purchase = c13911e.purchase;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }

    @Override // defpackage.InterfaceC1016e
    public void ad(Uri uri) {
        this.appmetrica = uri;
    }

    @Override // defpackage.InterfaceC8856e
    public int adcel() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC8856e
    public ClipData ads() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC8856e
    public ContentInfo applovin() {
        return null;
    }

    @Override // defpackage.InterfaceC1016e
    public C4278e build() {
        return new C4278e(new C13911e(this));
    }

    @Override // defpackage.InterfaceC8856e
    public int isPro() {
        return this.license;
    }

    @Override // defpackage.InterfaceC1016e
    public void setExtras(Bundle bundle) {
        this.purchase = bundle;
    }

    public String toString() {
        String str;
        switch (this.ad) {
            case 1:
                Uri uri = this.appmetrica;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.vip.getDescription());
                sb.append(", source=");
                int i = this.metrica;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.license;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                String str2 = BuildConfig.FLAVOR;
                if (uri == null) {
                    str = BuildConfig.FLAVOR;
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                if (this.purchase != null) {
                    str2 = ", hasExtras";
                }
                return AbstractC1786e.signatures(sb, str2, "}");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC1016e
    public void vip(int i) {
        this.license = i;
    }
}
