package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8597e extends AbstractC5735e {
    public final /* synthetic */ int appmetrica;
    public final /* synthetic */ C12636e purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8597e(Object obj, C12636e c12636e, int i) {
        super(obj);
        this.appmetrica = i;
        this.purchase = c12636e;
    }

    @Override // defpackage.AbstractC5735e
    public final void license(Object obj) {
        switch (this.appmetrica) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", AbstractC11866e.ad((C11531e) obj, MediaBrowserCompat$MediaItem.CREATOR));
                InterfaceC3455e interfaceC3455e = this.purchase.f25354e;
                if (interfaceC3455e != null) {
                    try {
                        interfaceC3455e.mo1365e(0, bundle);
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                return;
            case 1:
                List list = (List) obj;
                C12636e c12636e = this.purchase;
                try {
                    if (list == null) {
                        InterfaceC3455e interfaceC3455e2 = c12636e.f25354e;
                        if (interfaceC3455e2 == null) {
                            return;
                        } else {
                            interfaceC3455e2.mo1365e(-1, null);
                        }
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelableArray("search_results", (Parcelable[]) AbstractC11866e.vip(list, MediaBrowserCompat$MediaItem.CREATOR).toArray(new MediaBrowserCompat$MediaItem[0]));
                        InterfaceC3455e interfaceC3455e3 = c12636e.f25354e;
                        if (interfaceC3455e3 == null) {
                            return;
                        } else {
                            interfaceC3455e3.mo1365e(0, bundle2);
                        }
                    }
                    return;
                } catch (RemoteException unused2) {
                    return;
                }
            default:
                Bundle bundle3 = (Bundle) obj;
                InterfaceC3455e interfaceC3455e4 = this.purchase.f25354e;
                if (interfaceC3455e4 != null) {
                    try {
                        interfaceC3455e4.mo1365e(0, bundle3);
                        return;
                    } catch (RemoteException unused3) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // defpackage.AbstractC5735e
    public void metrica() {
        switch (this.appmetrica) {
            case 2:
                InterfaceC3455e interfaceC3455e = this.purchase.f25354e;
                if (interfaceC3455e != null) {
                    try {
                        interfaceC3455e.mo1365e(-1, null);
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                return;
            default:
                super.metrica();
                return;
        }
    }
}
