package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۧٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC17428e extends Binder implements InterfaceC3001e {
    public static final /* synthetic */ int adcel = 0;
    public final Set appmetrica;
    public C0409e billing;
    public final C11106e license;
    public final WeakReference metrica;
    public C4435e purchase;
    public SurfaceHolderC2120e startapp;
    public int yandex;

    public BinderC17428e(C6584e c6584e) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.metrica = new WeakReference(c6584e);
        this.license = new C11106e(c6584e);
        this.appmetrica = DesugarCollections.synchronizedSet(new HashSet());
        this.purchase = C4435e.f9618e;
        this.billing = C0409e.f2448e;
    }

    /* renamed from: eٜؑ٘, reason: contains not printable characters */
    public static void m4320e(C6584e c6584e, C18424e c18424e, int i, C9759e c9759e) {
        try {
            InterfaceC10645e interfaceC10645e = c18424e.license;
            interfaceC10645e.getClass();
            interfaceC10645e.adcel(i, c9759e);
            c6584e.metrica.ad(true, true);
        } catch (RemoteException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Failed to send result to controller " + c18424e, e);
        }
    }

    /* renamed from: eؚؓؓ, reason: contains not printable characters */
    public static C17687e m4321e(InterfaceC8427e interfaceC8427e) {
        return new C17687e(24, new C17687e(25, interfaceC8427e));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* renamed from: eًٓؓ, reason: contains not printable characters */
    public static ListenableFuture m4322e(C6584e c6584e, C18424e c18424e, int i, InterfaceC7449e interfaceC7449e, InterfaceC8427e interfaceC8427e) {
        if (c6584e.loadAd()) {
            return C13747e.f27231e;
        }
        ListenableFuture listenableFuture = (ListenableFuture) interfaceC7449e.startapp(c6584e, c18424e, i);
        ?? obj = new Object();
        listenableFuture.ad(new RunnableC6795e(c6584e, (Object) obj, interfaceC8427e, listenableFuture, 14), EnumC3320e.f7489e);
        return obj;
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: abstract */
    public final void mo941abstract(InterfaceC4342e interfaceC4342e, int i, Bundle bundle, long j) {
        C18424e m3007extends;
        if (interfaceC4342e == null || bundle == null || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        try {
            m4327e(m3007extends, i, 31, new C13511e(new C18070e(new C12019e(j, C1962e.ad(m3007extends.metrica, bundle)), new C15945e(7), 11), 1));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void adcel(InterfaceC4342e interfaceC4342e, C18424e c18424e) {
        if (interfaceC4342e == null) {
            AbstractC0223e.metrica(interfaceC4342e);
            return;
        }
        C6584e c6584e = (C6584e) this.metrica.get();
        if (c6584e == null || c6584e.loadAd()) {
            AbstractC0223e.metrica(interfaceC4342e);
        } else {
            this.appmetrica.add(c18424e);
            AbstractC9413e.m2565strictfp(c6584e.advert, new RunnableC6795e(this, c18424e, c6584e, interfaceC4342e, 13));
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: class */
    public final void mo942class(InterfaceC4342e interfaceC4342e, int i, String str, Bundle bundle) {
        if (interfaceC4342e == null || str == null || bundle == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AbstractC2803e.smaato("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
            return;
        }
        try {
            remoteconfig(interfaceC4342e, i, null, 40010, new C13511e(new C18070e(str, AbstractC5340e.ad(bundle), 9), 1));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for Rating", e);
        }
    }

    @Override // defpackage.InterfaceC3001e
    public final void crashlytics(InterfaceC4342e interfaceC4342e, int i, Bundle bundle, boolean z) {
        if (interfaceC4342e == null || bundle == null) {
            return;
        }
        try {
            m4326e(interfaceC4342e, i, 35, m4321e(new C18108e(C3335e.ad(bundle), z, 1)));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e);
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: else */
    public final void mo943else(InterfaceC4342e interfaceC4342e, int i) {
        C18424e m3007extends;
        if (interfaceC4342e == null || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        m4328e(m3007extends, i);
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eَؑۨ */
    public final void mo944e(InterfaceC4342e interfaceC4342e, int i) {
        C18424e m3007extends;
        if (interfaceC4342e == null || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        m4327e(m3007extends, i, 11, m4321e(new C13415e(23)));
    }

    /* renamed from: eؚؑ۟, reason: contains not printable characters */
    public final int m4323e(C18424e c18424e, C6268e c6268e, int i) {
        if (c6268e.mo2107e(17)) {
            C11106e c11106e = this.license;
            if (!c11106e.m3008final(c18424e, 17) && c11106e.m3008final(c18424e, 16)) {
                return c6268e.mo2115e() + i;
            }
        }
        return i;
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؑ۠ۖ */
    public final void mo945e(InterfaceC4342e interfaceC4342e, int i, Bundle bundle, boolean z) {
        C18424e m3007extends;
        if (interfaceC4342e == null || bundle == null || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        try {
            m4327e(m3007extends, i, 31, new C13511e(new C18070e(new C18108e(C1962e.ad(m3007extends.metrica, bundle), z, 0), new C15945e(7), 11), 1));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eۣؑۡ */
    public final void mo946e(InterfaceC4342e interfaceC4342e, int i, IBinder iBinder) {
        C18424e m3007extends;
        if (interfaceC4342e == null || iBinder == null || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        try {
            AbstractC17475e ad = BinderC7421e.ad(iBinder);
            C13304e Signature = AbstractC17475e.Signature();
            for (int i2 = 0; i2 < ad.size(); i2++) {
                Bundle bundle = (Bundle) ad.get(i2);
                bundle.getClass();
                Signature.metrica(C1962e.ad(m3007extends.metrica, bundle));
            }
            m4327e(m3007extends, i, 20, new C13511e(new C18070e(new C1519e(2, Signature.billing()), new C15945e(0), 12), 1));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؑۧٝ */
    public final void mo947e(InterfaceC4342e interfaceC4342e, int i, int i2, Bundle bundle) {
        C18424e m3007extends;
        if (interfaceC4342e == null || bundle == null || i2 < 0 || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        try {
            m4327e(m3007extends, i, 20, new C13511e(new C18070e(new C16237e(1, C1962e.ad(m3007extends.metrica, bundle)), new C2504e(this, i2, 2), 12), 1));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؒؑۜ */
    public final void mo948e(InterfaceC4342e interfaceC4342e, int i, int i2, int i3) {
        if (interfaceC4342e == null || i2 < 0 || i3 < 0) {
            return;
        }
        m4326e(interfaceC4342e, i, 20, m4321e(new C14422e(i2, i3, 5)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؒؓٙ */
    public final void mo949e(InterfaceC4342e interfaceC4342e, int i, final int i2, final int i3, final int i4) {
        if (interfaceC4342e == null || i2 < 0 || i3 < i2 || i4 < 0) {
            return;
        }
        m4326e(interfaceC4342e, i, 20, m4321e(new InterfaceC8427e() { // from class: eؗۗ
            @Override // defpackage.InterfaceC8427e
            public final void accept(Object obj) {
                ((C6268e) obj).mo2069e(i2, i3, i4);
            }
        }));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؒٚۨ */
    public final void mo950e(InterfaceC4342e interfaceC4342e, int i, int i2) {
        if (interfaceC4342e == null || i2 < 0) {
            return;
        }
        m4326e(interfaceC4342e, i, 20, new C17687e(24, new C2504e(this, i2, 4)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؒٞ٘ */
    public final void mo951e(InterfaceC4342e interfaceC4342e, int i, long j) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 5, m4321e(new C8739e(j)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٟؒؗ */
    public final void mo952e(InterfaceC4342e interfaceC4342e, int i, Bundle bundle) {
        if (interfaceC4342e == null || bundle == null) {
            return;
        }
        try {
            m4326e(interfaceC4342e, i, 29, m4321e(new C18070e(this, C4491e.vip(bundle), 6)));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e);
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؒۖۗ */
    public final void mo953e(InterfaceC4342e interfaceC4342e, int i) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 26, m4321e(new C13415e(22)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؒۤۨ */
    public final void mo954e(InterfaceC4342e interfaceC4342e, int i, int i2, int i3) {
        if (interfaceC4342e == null || i2 < 0) {
            return;
        }
        m4326e(interfaceC4342e, i, 33, m4321e(new C14422e(i2, i3, 4)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٕؓؗ */
    public final void mo955e(InterfaceC4342e interfaceC4342e, int i, int i2) {
        if (interfaceC4342e == null || i2 < 0) {
            return;
        }
        m4326e(interfaceC4342e, i, 25, m4321e(new C6802e(i2, 7)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؕؓٗ */
    public final void mo956e(InterfaceC4342e interfaceC4342e, int i) {
        C18424e m3007extends;
        if (interfaceC4342e == null || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        m4327e(m3007extends, i, 7, m4321e(new C13415e(24)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٟؕۡ */
    public final void mo957e(InterfaceC4342e interfaceC4342e, int i) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 20, m4321e(new C15945e(6)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eِؖؕ */
    public final void mo958e(InterfaceC4342e interfaceC4342e, int i, Bundle bundle) {
        mo945e(interfaceC4342e, i, bundle, true);
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؘْؖ */
    public final void mo959e(InterfaceC4342e interfaceC4342e, int i, IBinder iBinder, int i2, long j) {
        C18424e m3007extends;
        if (interfaceC4342e == null || iBinder == null) {
            return;
        }
        if ((i2 == -1 || i2 >= 0) && (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) != null) {
            try {
                AbstractC17475e ad = BinderC7421e.ad(iBinder);
                C13304e Signature = AbstractC17475e.Signature();
                for (int i3 = 0; i3 < ad.size(); i3++) {
                    Bundle bundle = (Bundle) ad.get(i3);
                    bundle.getClass();
                    Signature.metrica(C1962e.ad(m3007extends.metrica, bundle));
                }
                m4327e(m3007extends, i, 20, new C13511e(new C18070e(new C13790e(j, Signature.billing(), i2), new C15945e(7), 11), 1));
            } catch (RuntimeException e) {
                AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٍؖۙ */
    public final void mo960e(InterfaceC4342e interfaceC4342e, int i, int i2, int i3) {
        if (interfaceC4342e == null || i2 < 0 || i3 < i2) {
            return;
        }
        m4326e(interfaceC4342e, i, 20, new C17687e(24, new C17536e(this, i2, i3)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eًؖٝ */
    public final void mo961e(InterfaceC4342e interfaceC4342e, int i, int i2, IBinder iBinder) {
        C18424e m3007extends;
        if (interfaceC4342e == null || iBinder == null || i2 < 0 || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        try {
            AbstractC17475e ad = BinderC7421e.ad(iBinder);
            C13304e Signature = AbstractC17475e.Signature();
            for (int i3 = 0; i3 < ad.size(); i3++) {
                Bundle bundle = (Bundle) ad.get(i3);
                bundle.getClass();
                Signature.metrica(C1962e.ad(m3007extends.metrica, bundle));
            }
            m4327e(m3007extends, i, 20, new C13511e(new C18070e(new C1519e(1, Signature.billing()), new C2504e(this, i2, 3), 12), 1));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٌؖۡ */
    public final void mo962e(InterfaceC4342e interfaceC4342e, int i, float f) {
        if (interfaceC4342e == null || f <= 0.0f) {
            return;
        }
        m4326e(interfaceC4342e, i, 13, m4321e(new C16874e(3, f)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؘؕۥ */
    public final void mo963e(InterfaceC4342e interfaceC4342e, int i, float f) {
        if (interfaceC4342e == null || f < 0.0f || f > 1.0f) {
            return;
        }
        m4326e(interfaceC4342e, i, 24, m4321e(new C16874e(4, f)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؘؗؕ */
    public final void mo964e(InterfaceC4342e interfaceC4342e, int i) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 2, m4321e(new C15945e(5)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؙؐ٘ */
    public final void mo965e(InterfaceC4342e interfaceC4342e, int i, Bundle bundle) {
        C6584e c6584e = (C6584e) this.metrica.get();
        if (interfaceC4342e == null || bundle == null || c6584e == null) {
            AbstractC0223e.metrica(interfaceC4342e);
            return;
        }
        try {
            Context context = c6584e.purchase;
            C5412e ad = C5412e.ad(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            String str = ad.metrica;
            if (AbstractC0223e.vip(callingUid, context, str) == 1) {
                AbstractC2803e.smaato("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                AbstractC0223e.metrica(interfaceC4342e);
                return;
            }
            long clearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = ad.license;
            }
            try {
                C18287e c18287e = new C18287e(str, callingPid, callingUid);
                boolean ads = C5389e.isVip(context).ads(c18287e);
                int i2 = ad.ad;
                int i3 = ad.vip;
                adcel(interfaceC4342e, new C18424e(c18287e, i2, i3, ads, new C4958e(interfaceC4342e, i3), ad.appmetrica));
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؙؙٝ */
    public final void mo966e(InterfaceC4342e interfaceC4342e, int i, int i2, long j) {
        if (interfaceC4342e == null || i2 < 0) {
            return;
        }
        m4326e(interfaceC4342e, i, 10, new C17687e(24, new C13790e(j, this, i2)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؙۛ۠ */
    public final void mo967e(InterfaceC4342e interfaceC4342e, int i) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 4, m4321e(new C15945e(4)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؚؚؓ */
    public final void mo968e(InterfaceC4342e interfaceC4342e, int i) {
        C18424e m3007extends;
        if (interfaceC4342e == null || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        m4327e(m3007extends, i, 12, m4321e(new C13415e(27)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eًؚؔ */
    public final void mo969e(InterfaceC4342e interfaceC4342e, int i, boolean z) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 26, m4321e(new C1941e(z, 5)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٍؙۨ */
    public final void mo970e(InterfaceC4342e interfaceC4342e, int i, Bundle bundle) {
        C18424e m3007extends;
        if (interfaceC4342e == null || bundle == null || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        try {
            m4327e(m3007extends, i, 19, m4321e(new C11508e(C12053e.vip(m3007extends.metrica, bundle), 2)));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e);
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eُٓؓ */
    public final void mo971e(InterfaceC4342e interfaceC4342e, int i) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 8, m4321e(new C13415e(21)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؘُٗ */
    public final void mo972e(InterfaceC4342e interfaceC4342e, int i, int i2) {
        if (interfaceC4342e == null || i2 < 0) {
            return;
        }
        m4326e(interfaceC4342e, i, 10, new C17687e(24, new C2504e(this, i2, 0)));
    }

    /* renamed from: eُٚۜ, reason: contains not printable characters */
    public final C16437e m4324e(C16437e c16437e) {
        String str = (String) this.purchase.get(c16437e);
        if (str == null) {
            str = c16437e.vip;
        }
        int i = 0;
        while (true) {
            int i2 = c16437e.ad;
            C16975e[] c16975eArr = c16437e.license;
            if (i >= i2) {
                return new C16437e(str, c16975eArr);
            }
            if (c16975eArr[i].smaato != null) {
                C16975e[] c16975eArr2 = new C16975e[i2];
                for (int i3 = 0; i3 < c16437e.ad; i3++) {
                    C16975e c16975e = c16975eArr[i3];
                    String str2 = c16975e.smaato;
                    String str3 = str2 != null ? (String) this.billing.get(str2) : null;
                    if (str3 != null) {
                        C11445e ad = c16975e.ad();
                        ad.advert = str3;
                        c16975eArr2[i3] = new C16975e(ad);
                    } else {
                        c16975eArr2[i3] = c16975e;
                    }
                }
                return new C16437e(str, c16975eArr2);
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eُۘٙ */
    public final void mo973e(InterfaceC4342e interfaceC4342e, int i, int i2, Bundle bundle) {
        C18424e m3007extends;
        if (interfaceC4342e == null || bundle == null || i2 < 0 || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        try {
            m4327e(m3007extends, i, 20, new C13511e(new C18070e(new C16237e(0, C1962e.ad(m3007extends.metrica, bundle)), new C2504e(this, i2, 1), 12), 1));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eُۚۙ */
    public final void mo974e(InterfaceC4342e interfaceC4342e, int i, Surface surface, int i2, int i3) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 27, m4321e(new C6696e(this, surface, i2, i3, 2)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eُِۤ */
    public final void mo975e(InterfaceC4342e interfaceC4342e, int i) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 6, m4321e(new C13415e(25)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eُِؕ */
    public final void mo976e(InterfaceC4342e interfaceC4342e, int i, boolean z) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 1, m4321e(new C1941e(z, 4)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eِْ۠ */
    public final void mo977e(InterfaceC4342e interfaceC4342e, int i, Surface surface) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 27, m4321e(new C18070e(this, surface, 10)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؙِۡ */
    public final void mo978e(InterfaceC4342e interfaceC4342e, int i, IBinder iBinder, boolean z) {
        C18424e m3007extends;
        if (interfaceC4342e == null || iBinder == null || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        try {
            AbstractC17475e ad = BinderC7421e.ad(iBinder);
            C13304e Signature = AbstractC17475e.Signature();
            for (int i2 = 0; i2 < ad.size(); i2++) {
                Bundle bundle = (Bundle) ad.get(i2);
                bundle.getClass();
                Signature.metrica(C1962e.ad(m3007extends.metrica, bundle));
            }
            m4327e(m3007extends, i, 20, new C13511e(new C18070e(new C18108e(Signature.billing(), z, 2), new C15945e(7), 11), 1));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٓؒؔ */
    public final void mo979e(InterfaceC4342e interfaceC4342e, int i, boolean z) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 14, m4321e(new C1941e(z, 6)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٍٓۢ */
    public final void mo980e(InterfaceC4342e interfaceC4342e, int i, int i2) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 34, m4321e(new C6802e(i2, 4)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eِٓۦ */
    public final void mo981e(InterfaceC4342e interfaceC4342e, int i) {
        C18424e m3007extends;
        if (interfaceC4342e == null || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        m4327e(m3007extends, i, 3, m4321e(new C15945e(2)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eّٔؗ */
    public final void mo982e(InterfaceC4342e interfaceC4342e, int i) {
        C18424e m3007extends;
        if (interfaceC4342e == null || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        m4327e(m3007extends, i, 9, m4321e(new C13415e(28)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٖٔ٘ */
    public final void mo983e(InterfaceC4342e interfaceC4342e, int i, Bundle bundle) {
        if (interfaceC4342e == null || bundle == null) {
            return;
        }
        try {
            m4326e(interfaceC4342e, i, 13, m4321e(new C14719e(new C4194e(bundle.getFloat(C4194e.appmetrica, 1.0f), bundle.getFloat(C4194e.purchase, 1.0f)), 2)));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e);
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٔٞۢ */
    public final void mo984e(InterfaceC4342e interfaceC4342e, int i) {
        if (interfaceC4342e == null) {
            return;
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            C6584e c6584e = (C6584e) this.metrica.get();
            if (c6584e != null && !c6584e.loadAd()) {
                AbstractC9413e.m2565strictfp(c6584e.advert, new RunnableC7410e(this, interfaceC4342e, 22));
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [super, eٌٔۛ] */
    /* renamed from: eٔۚٙ, reason: contains not printable characters */
    public final C2411e m4325e(C2411e c2411e) {
        AbstractC17475e abstractC17475e = c2411e.f6185class.ad;
        ?? csuper = new Csuper(4);
        Csuper ad = AbstractC8507e.ad();
        for (int i = 0; i < abstractC17475e.size(); i++) {
            C16437e c16437e = ((C6653e) abstractC17475e.get(i)).vip;
            String str = (String) this.purchase.get(c16437e);
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                int i2 = this.yandex;
                this.yandex = i2 + 1;
                String str2 = AbstractC9413e.ad;
                sb.append(Integer.toString(i2, 36));
                sb.append("-");
                sb.append(c16437e.vip);
                str = sb.toString();
            }
            csuper.m3905switch(c16437e, str);
            ad.mo3904implements(c16437e.vip, str);
        }
        this.purchase = csuper.smaato();
        this.billing = ad.mopub(false);
        C13304e Signature = AbstractC17475e.Signature();
        for (int i3 = 0; i3 < abstractC17475e.size(); i3++) {
            C6653e c6653e = (C6653e) abstractC17475e.get(i3);
            Signature.metrica(new C6653e(m4324e(c6653e.vip), c6653e.metrica, c6653e.license, c6653e.appmetrica));
        }
        C2411e vip = c2411e.vip(new C18255e(Signature.billing()));
        C4491e c4491e = vip.f6186interface;
        if (c4491e.f9751goto.isEmpty()) {
            return vip;
        }
        C14142e metrica = c4491e.ad().metrica();
        AbstractC7014e it = c4491e.f9751goto.values().iterator();
        while (it.hasNext()) {
            C11680e c11680e = (C11680e) it.next();
            metrica.ad(new C11680e(m4324e(c11680e.ad), c11680e.vip));
        }
        return vip.loadAd(metrica.vip());
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٔۥۥ */
    public final void mo985e(InterfaceC4342e interfaceC4342e, int i) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 26, m4321e(new C13415e(29)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٕٙؗ */
    public final void mo986e(InterfaceC4342e interfaceC4342e, int i, int i2, int i3, IBinder iBinder) {
        C18424e m3007extends;
        if (interfaceC4342e == null || iBinder == null || i2 < 0 || i3 < i2 || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        try {
            AbstractC17475e ad = BinderC7421e.ad(iBinder);
            C13304e Signature = AbstractC17475e.Signature();
            for (int i4 = 0; i4 < ad.size(); i4++) {
                Bundle bundle = (Bundle) ad.get(i4);
                bundle.getClass();
                Signature.metrica(C1962e.ad(m3007extends.metrica, bundle));
            }
            m4327e(m3007extends, i, 20, new C13511e(new C18070e(new C11867e(Signature.billing(), 2), new C17536e(this, i2, i3), 12), 1));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؙٖؐ */
    public final void mo987e(InterfaceC4342e interfaceC4342e, int i, Bundle bundle, Bundle bundle2) {
        mo995public(interfaceC4342e, i, bundle, bundle2, false);
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؘٖؗ */
    public final void mo988e(InterfaceC4342e interfaceC4342e, int i, int i2) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 34, m4321e(new C6802e(i2, 5)));
    }

    /* renamed from: eًٖٕ, reason: contains not printable characters */
    public final void m4326e(InterfaceC4342e interfaceC4342e, int i, int i2, C17687e c17687e) {
        C18424e m3007extends = this.license.m3007extends(interfaceC4342e.asBinder());
        if (m3007extends != null) {
            m4327e(m3007extends, i, i2, c17687e);
        }
    }

    /* renamed from: eٖۤٝ, reason: contains not printable characters */
    public final void m4327e(final C18424e c18424e, final int i, final int i2, final InterfaceC7449e interfaceC7449e) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final C6584e c6584e = (C6584e) this.metrica.get();
            if (c6584e != null && !c6584e.loadAd()) {
                AbstractC9413e.m2565strictfp(c6584e.advert, new Runnable() { // from class: eؚؒٔ
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, eؚٙۜ] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11106e c11106e = BinderC17428e.this.license;
                        final C18424e c18424e2 = c18424e;
                        int i3 = i2;
                        boolean m3008final = c11106e.m3008final(c18424e2, i3);
                        final C6584e c6584e2 = c6584e;
                        final int i4 = i;
                        if (!m3008final) {
                            BinderC17428e.m4320e(c6584e2, c18424e2, i4, new C9759e(-4));
                            return;
                        }
                        C1439e c1439e = c6584e2.appmetrica;
                        c6584e2.m2208native(c18424e2);
                        c1439e.getClass();
                        final InterfaceC7449e interfaceC7449e2 = interfaceC7449e;
                        if (i3 != 27) {
                            c11106e.admob(c18424e2, i3, new InterfaceC7251e() { // from class: eََ٘
                                @Override // defpackage.InterfaceC7251e
                                public final ListenableFuture run() {
                                    return (ListenableFuture) InterfaceC7449e.this.startapp(c6584e2, c18424e2, i4);
                                }
                            });
                        } else {
                            interfaceC7449e2.startapp(c6584e2, c18424e2, i4);
                            c11106e.admob(c18424e2, i3, new Object());
                        }
                    }
                });
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eِٗۛ */
    public final void mo989e(InterfaceC4342e interfaceC4342e) {
        if (interfaceC4342e == null) {
            return;
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            C6584e c6584e = (C6584e) this.metrica.get();
            if (c6584e != null && !c6584e.loadAd()) {
                C18424e m3007extends = this.license.m3007extends(interfaceC4342e.asBinder());
                if (m3007extends != null) {
                    AbstractC9413e.m2565strictfp(c6584e.advert, new RunnableC7410e(this, m3007extends, 23));
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٕٗٛ */
    public final void mo990e(InterfaceC4342e interfaceC4342e, int i, int i2, int i3) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 27, m4321e(new C17536e(this, i2, i3)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٗٚٚ */
    public final void mo991e(InterfaceC4342e interfaceC4342e, int i, boolean z, int i2) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 34, m4321e(new C6877e(z, i2)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eۣ٘ؓ */
    public final void mo992e(InterfaceC4342e interfaceC4342e, int i, int i2) {
        if (interfaceC4342e == null) {
            return;
        }
        if (i2 == 2 || i2 == 0 || i2 == 1) {
            m4326e(interfaceC4342e, i, 15, m4321e(new C6802e(i2, 6)));
        }
    }

    /* renamed from: eٍۡ, reason: contains not printable characters */
    public final void m4328e(C18424e c18424e, int i) {
        m4327e(c18424e, i, 1, m4321e(new C18070e(this, c18424e, 8)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: interface */
    public final void mo993interface(InterfaceC4342e interfaceC4342e, int i) {
        C18424e m3007extends;
        if (interfaceC4342e == null || (m3007extends = this.license.m3007extends(interfaceC4342e.asBinder())) == null) {
            return;
        }
        m4327e(m3007extends, i, 1, m4321e(new C13415e(20)));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C18424e m3007extends;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        switch (i) {
            case 3002:
                mo963e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                mo955e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                mo953e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                mo985e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                mo969e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                mo945e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                mo941abstract(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                mo945e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                mo978e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                mo978e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                mo959e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                mo976e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3014:
                subs(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                mo965e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                InterfaceC4342e adcel2 = BinderC4329e.adcel(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                mo995public(adcel2, readInt, (Bundle) AbstractC5458e.vip(parcel, creator), (Bundle) AbstractC5458e.vip(parcel, creator), false);
                return true;
            case 3017:
                mo992e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3018:
                mo979e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3019:
                mo950e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3020:
                mo960e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3021:
                mo957e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3022:
                mo948e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3023:
                mo949e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3024:
                mo943else(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3025:
                mo993interface(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3026:
                mo964e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3027:
                mo983e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR));
                return true;
            case 3028:
                mo962e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3029:
                InterfaceC4342e adcel3 = BinderC4329e.adcel(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR);
                if (adcel3 != null && bundle != null && (m3007extends = this.license.m3007extends(adcel3.asBinder())) != null) {
                    try {
                        m4327e(m3007extends, readInt2, 20, new C13511e(new C18070e(new C16237e(2, C1962e.ad(m3007extends.metrica, bundle)), new C15945e(1), 12), 1));
                    } catch (RuntimeException e) {
                        AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
                    }
                }
                return true;
            case 3030:
                mo973e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR));
                return true;
            case 3031:
                mo946e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3032:
                mo961e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3033:
                mo970e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR));
                return true;
            case 3034:
                mo981e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3035:
                mo984e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3036:
                mo967e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3037:
                mo972e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3038:
                mo951e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                return true;
            case 3039:
                mo966e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                return true;
            case 3040:
                mo944e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3041:
                mo968e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3042:
                mo975e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3043:
                mo971e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3044:
                mo977e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), (Surface) AbstractC5458e.vip(parcel, Surface.CREATOR));
                return true;
            case 3045:
                mo989e(BinderC4329e.adcel(parcel.readStrongBinder()));
                return true;
            case 3046:
                mo956e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3047:
                mo982e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3048:
                mo952e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR));
                return true;
            case 3049:
                mo942class(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR));
                return true;
            case 3050:
                InterfaceC4342e adcel4 = BinderC4329e.adcel(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                Bundle bundle2 = (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR);
                if (adcel4 != null && bundle2 != null) {
                    try {
                        remoteconfig(adcel4, readInt3, null, 40010, new C13511e(new C17687e(26, AbstractC5340e.ad(bundle2)), 1));
                    } catch (RuntimeException e2) {
                        AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for Rating", e2);
                    }
                }
                return true;
            case 3051:
                mo954e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3052:
                mo988e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3053:
                mo980e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3054:
                mo991e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                return true;
            case 3055:
                mo947e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR));
                return true;
            case 3056:
                mo986e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3057:
                crashlytics(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3058:
                mo994protected(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3059:
                mo996transient(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3060:
                InterfaceC4342e adcel5 = BinderC4329e.adcel(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                mo995public(adcel5, readInt4, (Bundle) AbstractC5458e.vip(parcel, creator2), (Bundle) AbstractC5458e.vip(parcel, creator2), parcel.readInt() != 0);
                return true;
            case 3061:
                mo974e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), (Surface) AbstractC5458e.vip(parcel, Surface.CREATOR), parcel.readInt(), parcel.readInt());
                return true;
            case 3062:
                mo990e(BinderC4329e.adcel(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            default:
                C11753e c11753e = null;
                switch (i) {
                    case 4001:
                        InterfaceC4342e adcel6 = BinderC4329e.adcel(parcel.readStrongBinder());
                        int readInt5 = parcel.readInt();
                        Bundle bundle3 = (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR);
                        if (adcel6 != null) {
                            if (bundle3 != null) {
                                try {
                                    c11753e = C11753e.ad(bundle3);
                                } catch (RuntimeException e3) {
                                    AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e3);
                                }
                            }
                            remoteconfig(adcel6, readInt5, null, 50000, new C13511e(new C17687e(23, c11753e), 0));
                        }
                        return true;
                    case 4002:
                        InterfaceC4342e adcel7 = BinderC4329e.adcel(parcel.readStrongBinder());
                        int readInt6 = parcel.readInt();
                        String readString = parcel.readString();
                        if (adcel7 != null) {
                            if (TextUtils.isEmpty(readString)) {
                                AbstractC2803e.smaato("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            remoteconfig(adcel7, readInt6, null, 50004, new C13511e(new C13415e(26, readString), 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        InterfaceC4342e adcel8 = BinderC4329e.adcel(parcel.readStrongBinder());
                        int readInt7 = parcel.readInt();
                        final String readString2 = parcel.readString();
                        final int readInt8 = parcel.readInt();
                        final int readInt9 = parcel.readInt();
                        Bundle bundle4 = (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR);
                        if (adcel8 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                AbstractC2803e.smaato("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (readInt8 < 0) {
                                AbstractC2803e.smaato("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (readInt9 < 1) {
                                AbstractC2803e.smaato("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle4 != null) {
                                    try {
                                        c11753e = C11753e.ad(bundle4);
                                    } catch (RuntimeException e4) {
                                        AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e4);
                                    }
                                }
                                final C11753e c11753e2 = c11753e;
                                final int i3 = 0;
                                remoteconfig(adcel8, readInt7, null, 50003, new C13511e(new InterfaceC7449e() { // from class: eؒۜۗ
                                    @Override // defpackage.InterfaceC7449e
                                    public final Object startapp(C6584e c6584e, C18424e c18424e, int i4) {
                                        switch (i3) {
                                            case 0:
                                                return c6584e.signatures(c18424e, readString2, readInt8, readInt9, c11753e2);
                                            default:
                                                return c6584e.inmobi(c18424e, readString2, readInt8, readInt9, c11753e2);
                                        }
                                    }
                                }, 0));
                            }
                        }
                        return true;
                    case 4004:
                        InterfaceC4342e adcel9 = BinderC4329e.adcel(parcel.readStrongBinder());
                        int readInt10 = parcel.readInt();
                        String readString3 = parcel.readString();
                        Bundle bundle5 = (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR);
                        if (adcel9 != null) {
                            if (TextUtils.isEmpty(readString3)) {
                                AbstractC2803e.smaato("MediaSessionStub", "search(): Ignoring empty query");
                            } else {
                                if (bundle5 != null) {
                                    try {
                                        c11753e = C11753e.ad(bundle5);
                                    } catch (RuntimeException e5) {
                                        AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e5);
                                    }
                                }
                                remoteconfig(adcel9, readInt10, null, 50005, new C13511e(new C6248e(2, c11753e, readString3), 0));
                            }
                        }
                        return true;
                    case 4005:
                        InterfaceC4342e adcel10 = BinderC4329e.adcel(parcel.readStrongBinder());
                        int readInt11 = parcel.readInt();
                        final String readString4 = parcel.readString();
                        final int readInt12 = parcel.readInt();
                        final int readInt13 = parcel.readInt();
                        Bundle bundle6 = (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR);
                        if (adcel10 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                AbstractC2803e.smaato("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (readInt12 < 0) {
                                AbstractC2803e.smaato("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (readInt13 < 1) {
                                AbstractC2803e.smaato("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle6 != null) {
                                    try {
                                        c11753e = C11753e.ad(bundle6);
                                    } catch (RuntimeException e6) {
                                        AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e6);
                                    }
                                }
                                final C11753e c11753e3 = c11753e;
                                final int i4 = 1;
                                remoteconfig(adcel10, readInt11, null, 50006, new C13511e(new InterfaceC7449e() { // from class: eؒۜۗ
                                    @Override // defpackage.InterfaceC7449e
                                    public final Object startapp(C6584e c6584e, C18424e c18424e, int i42) {
                                        switch (i4) {
                                            case 0:
                                                return c6584e.signatures(c18424e, readString4, readInt12, readInt13, c11753e3);
                                            default:
                                                return c6584e.inmobi(c18424e, readString4, readInt12, readInt13, c11753e3);
                                        }
                                    }
                                }, 0));
                            }
                        }
                        return true;
                    case 4006:
                        InterfaceC4342e adcel11 = BinderC4329e.adcel(parcel.readStrongBinder());
                        int readInt14 = parcel.readInt();
                        String readString5 = parcel.readString();
                        Bundle bundle7 = (Bundle) AbstractC5458e.vip(parcel, Bundle.CREATOR);
                        if (adcel11 != null) {
                            if (TextUtils.isEmpty(readString5)) {
                                AbstractC2803e.smaato("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle7 != null) {
                                    try {
                                        c11753e = C11753e.ad(bundle7);
                                    } catch (RuntimeException e7) {
                                        AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e7);
                                    }
                                }
                                remoteconfig(adcel11, readInt14, null, 50001, new C13511e(new C6248e(1, c11753e, readString5), 0));
                            }
                        }
                        return true;
                    case 4007:
                        InterfaceC4342e adcel12 = BinderC4329e.adcel(parcel.readStrongBinder());
                        int readInt15 = parcel.readInt();
                        String readString6 = parcel.readString();
                        if (adcel12 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                AbstractC2803e.smaato("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            remoteconfig(adcel12, readInt15, null, 50002, new C13511e(new C1035e(readString6), 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: protected */
    public final void mo994protected(InterfaceC4342e interfaceC4342e, int i) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 24, m4321e(new C13415e(19)));
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: public */
    public final void mo995public(final InterfaceC4342e interfaceC4342e, final int i, Bundle bundle, Bundle bundle2, boolean z) {
        Bundle Signature = AbstractC9413e.Signature(bundle2);
        if (interfaceC4342e == null || bundle == null || Signature == null) {
            return;
        }
        try {
            final C11858e ad = C11858e.ad(bundle);
            if (!C11161e.amazon(ad.vip)) {
                remoteconfig(interfaceC4342e, i, ad, 0, new C13511e(new C18070e(z, ad, Signature), 1));
                return;
            }
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                final C6584e c6584e = (C6584e) this.metrica.get();
                if (c6584e != null && !c6584e.loadAd()) {
                    final C18424e m3007extends = this.license.m3007extends(interfaceC4342e.asBinder());
                    if (m3007extends == null) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    } else {
                        AbstractC9413e.m2565strictfp(c6584e.advert, new Runnable() { // from class: eؒۙٝ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C11858e c11858e = ad;
                                String str = c11858e.vip;
                                C6584e c6584e2 = c6584e;
                                int i2 = i;
                                BinderC17428e binderC17428e = BinderC17428e.this;
                                C11106e c11106e = binderC17428e.license;
                                C18424e c18424e = m3007extends;
                                if (c11106e.m3002catch(c18424e)) {
                                    try {
                                        C11161e license = C11161e.license(c11858e);
                                        Object obj = license.adcel;
                                        int i3 = license.vip;
                                        if (!license.vip()) {
                                            AbstractC2803e.smaato("MediaSessionStub", "Can't execute predefined custom command: " + str);
                                            BinderC17428e.m4320e(c6584e2, c18424e, i2, new C9759e(-6));
                                            return;
                                        }
                                        C11858e c11858e2 = license.ad;
                                        if (c11858e2 != null) {
                                            AbstractC2301e.subscription(c11858e2.ad == 40010);
                                            binderC17428e.remoteconfig(interfaceC4342e, i2, null, 40010, new C13511e(new C14147e(license), 1));
                                            return;
                                        }
                                        C6268e c6268e = c6584e2.pro;
                                        if (i3 == 1) {
                                            if (obj != null) {
                                                r4 = ((Boolean) obj).booleanValue();
                                            } else if (!c6268e.mo2129interface()) {
                                                r4 = true;
                                            }
                                        }
                                        if (r4) {
                                            binderC17428e.m4328e(c18424e, i2);
                                        } else if (i3 == 31) {
                                            obj.getClass();
                                            binderC17428e.m4327e(c18424e, i2, 31, new C13511e(new C18070e(new C18108e((C1962e) obj, true, 0), new C15945e(7), 11), 1));
                                        } else {
                                            binderC17428e.m4327e(c18424e, i2, i3, BinderC17428e.m4321e(new C14147e(license)));
                                        }
                                        c11106e.premium(c18424e);
                                    } catch (RuntimeException e) {
                                        AbstractC2803e.amazon("MediaSessionStub", "Failed to convert predefined custom command: " + str, e);
                                        BinderC17428e.m4320e(c6584e2, c18424e, i2, new C9759e(-3));
                                    }
                                }
                            }
                        });
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    public final void remoteconfig(InterfaceC4342e interfaceC4342e, final int i, final C11858e c11858e, final int i2, final InterfaceC7449e interfaceC7449e) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final C6584e c6584e = (C6584e) this.metrica.get();
            if (c6584e != null && !c6584e.loadAd()) {
                final C18424e m3007extends = this.license.m3007extends(interfaceC4342e.asBinder());
                if (m3007extends == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } else {
                    AbstractC9413e.m2565strictfp(c6584e.advert, new Runnable() { // from class: eٌٔۘ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C11106e c11106e = BinderC17428e.this.license;
                            C18424e c18424e = m3007extends;
                            if (c11106e.m3002catch(c18424e)) {
                                C11858e c11858e2 = c11858e;
                                C6584e c6584e2 = c6584e;
                                int i3 = i;
                                if (c11858e2 != null) {
                                    if (!c11106e.m3021strictfp(c18424e, c11858e2)) {
                                        BinderC17428e.m4320e(c6584e2, c18424e, i3, new C9759e(-4));
                                        return;
                                    }
                                } else if (!c11106e.m3015new(c18424e, i2)) {
                                    BinderC17428e.m4320e(c6584e2, c18424e, i3, new C9759e(-4));
                                    return;
                                }
                                interfaceC7449e.startapp(c6584e2, c18424e, i3);
                            }
                        }
                    });
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // defpackage.InterfaceC3001e
    public final void subs(InterfaceC4342e interfaceC4342e, int i, Bundle bundle) {
        C11030e c11030e;
        if (interfaceC4342e == null || bundle == null) {
            return;
        }
        try {
            C9759e ad = C9759e.ad(bundle);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                C11106e c11106e = this.license;
                IBinder asBinder = interfaceC4342e.asBinder();
                synchronized (c11106e.f22008e) {
                    try {
                        C18424e m3007extends = c11106e.m3007extends(asBinder);
                        c11030e = m3007extends != null ? (C11030e) ((C2271e) c11106e.f22009e).get(m3007extends) : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C18100e c18100e = c11030e != null ? c11030e.vip : null;
                if (c18100e == null) {
                    return;
                }
                c18100e.mopub(i, ad);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: transient */
    public final void mo996transient(InterfaceC4342e interfaceC4342e, int i) {
        if (interfaceC4342e == null) {
            return;
        }
        m4326e(interfaceC4342e, i, 24, m4321e(new C15945e(3)));
    }
}
