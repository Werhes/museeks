package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7703e implements InterfaceC18244e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C14742e vip;

    public /* synthetic */ C7703e(C14742e c14742e, int i) {
        this.ad = i;
        this.vip = c14742e;
    }

    @Override // defpackage.InterfaceC18244e
    public final ListenableFuture apply(Object obj) {
        ListenableFuture listenableFuture;
        switch (this.ad) {
            case 0:
                C14742e c14742e = this.vip;
                synchronized (c14742e.startapp) {
                    listenableFuture = (ListenableFuture) c14742e.mopub;
                }
                return listenableFuture;
            case 1:
                C14742e c14742e2 = this.vip;
                return AbstractC2017e.license(c14742e2.Signature((Uri) AbstractC2017e.vip((ListenableFuture) c14742e2.metrica)));
            case 2:
                C14742e c14742e3 = this.vip;
                c14742e3.admob((Uri) AbstractC2017e.vip((ListenableFuture) c14742e3.metrica), obj);
                return C13747e.f27231e;
            default:
                C14742e c14742e4 = this.vip;
                Uri uri = (Uri) obj;
                Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                try {
                    C6843e c6843e = (C6843e) c14742e4.purchase;
                    C11467e vip = c6843e.vip(build);
                    if (((InterfaceC1312e) vip.f23072e).vip((Uri) vip.f23071e)) {
                        C11467e vip2 = c6843e.vip(build);
                        C11467e vip3 = c6843e.vip(uri);
                        InterfaceC1312e interfaceC1312e = (InterfaceC1312e) vip2.f23072e;
                        if (interfaceC1312e != ((InterfaceC1312e) vip3.f23072e)) {
                            throw new IOException("Cannot rename file across backends");
                        }
                        interfaceC1312e.purchase((Uri) vip2.f23071e, (Uri) vip3.f23071e);
                    }
                    return C13747e.f27231e;
                } catch (IOException e) {
                    return AbstractC2017e.metrica(e);
                }
        }
    }
}
