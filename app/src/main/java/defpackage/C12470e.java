package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12470e implements InterfaceC4876e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InputContentInfo f24965e;

    public C12470e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f24965e = new InputContentInfo(uri, clipDescription, uri2);
    }

    public C12470e(Object obj) {
        this.f24965e = (InputContentInfo) obj;
    }

    @Override // defpackage.InterfaceC4876e
    public final Uri advert() {
        return this.f24965e.getContentUri();
    }

    @Override // defpackage.InterfaceC4876e
    public final Uri amazon() {
        return this.f24965e.getLinkUri();
    }

    @Override // defpackage.InterfaceC4876e
    public final void smaato() {
        this.f24965e.requestPermission();
    }

    @Override // defpackage.InterfaceC4876e
    public final Object subscription() {
        return this.f24965e;
    }

    @Override // defpackage.InterfaceC4876e
    public final ClipDescription vip() {
        return this.f24965e.getDescription();
    }
}
