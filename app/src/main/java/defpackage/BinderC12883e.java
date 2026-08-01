package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC12883e extends Binder implements InterfaceC14444e {
    public final Set appmetrica;
    public final Handler license;
    public final WeakReference metrica;

    public BinderC12883e(PlaybackService playbackService) {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.metrica = new WeakReference(playbackService);
        this.license = new Handler(playbackService.getApplicationContext().getMainLooper());
        this.appmetrica = DesugarCollections.synchronizedSet(new HashSet());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eؘؖؐ, java.lang.Object, eٔؑٝ] */
    public static InterfaceC14444e adcel(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC14444e)) {
            return (InterfaceC14444e) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.metrica = iBinder;
        return obj;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.InterfaceC14444e
    /* renamed from: eؘۗٚ */
    public final void mo1913e(InterfaceC4342e interfaceC4342e, Bundle bundle) {
        if (interfaceC4342e == null || bundle == null) {
            AbstractC0223e.metrica(interfaceC4342e);
            return;
        }
        try {
            C5412e ad = C5412e.ad(bundle);
            String str = ad.metrica;
            PlaybackService playbackService = (PlaybackService) this.metrica.get();
            if (playbackService == null) {
                AbstractC0223e.metrica(interfaceC4342e);
                return;
            }
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            long clearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = ad.license;
            }
            if (AbstractC0223e.vip(callingUid, playbackService, str) == 0) {
                C18287e c18287e = new C18287e(str, callingPid, callingUid);
                boolean ads = C5389e.isVip(playbackService.getApplicationContext()).ads(c18287e);
                this.appmetrica.add(interfaceC4342e);
                try {
                    this.license.post(new RunnableC6666e(1, this, interfaceC4342e, c18287e, ad, ads));
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            AbstractC2803e.smaato("MSessionService", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
            AbstractC0223e.metrica(interfaceC4342e);
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MSessionService", "Ignoring malformed Bundle for ConnectionRequest", e);
            AbstractC0223e.metrica(interfaceC4342e);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        }
        if (i != 3001) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        mo1913e(BinderC4329e.adcel(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}
