package defpackage;

import android.net.Uri;
import java.io.OutputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۡۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8276e implements InterfaceC1312e {
    @Override // defpackage.InterfaceC1312e
    public final void appmetrica(Uri uri) {
        ((C2923e) this).vip.appmetrica(billing(uri));
    }

    public abstract Uri billing(Uri uri);

    @Override // defpackage.InterfaceC1312e
    public final OutputStream license(Uri uri) {
        return ((C2923e) this).vip.license(billing(uri));
    }

    @Override // defpackage.InterfaceC1312e
    public final void purchase(Uri uri, Uri uri2) {
        ((C2923e) this).vip.purchase(billing(uri), billing(uri2));
    }
}
