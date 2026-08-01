package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12435e implements InterfaceC12504e, InterfaceC1360e, InterfaceC8427e, InterfaceC18472e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f24876e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f24877e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24878e;

    public /* synthetic */ C12435e(int i, C1410e c1410e, int i2) {
        this.f24878e = i2;
        this.f24877e = i;
        this.f24876e = c1410e;
    }

    public /* synthetic */ C12435e(Object obj, int i, int i2) {
        this.f24878e = i2;
        this.f24876e = obj;
        this.f24877e = i;
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        C8802e vip;
        C18424e c18424e = (C18424e) this.f24876e;
        int i = this.f24877e;
        try {
            vip = (C8802e) ((ListenableFuture) obj).get();
            AbstractC2301e.amazon(vip, "LibraryResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            AbstractC2803e.amazon("MediaSessionStub", "Library operation failed", e);
            vip = C8802e.vip(-1);
        } catch (CancellationException e2) {
            AbstractC2803e.amazon("MediaSessionStub", "Library operation cancelled", e2);
            vip = C8802e.vip(1);
        } catch (ExecutionException e3) {
            e = e3;
            AbstractC2803e.amazon("MediaSessionStub", "Library operation failed", e);
            vip = C8802e.vip(-1);
        }
        try {
            InterfaceC10645e interfaceC10645e = c18424e.license;
            interfaceC10645e.getClass();
            interfaceC10645e.billing(i, vip);
        } catch (RemoteException e4) {
            AbstractC2803e.amazon("MediaSessionStub", "Failed to send result to browser " + c18424e, e4);
        }
    }

    @Override // defpackage.InterfaceC18472e
    public boolean ad(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f24876e;
        int i = this.f24877e;
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC1786e.signatures(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = sideSheetBehavior.Signature;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.remoteconfig(i);
            return true;
        }
        View view2 = (View) sideSheetBehavior.Signature.get();
        RunnableC9766e runnableC9766e = new RunnableC9766e(sideSheetBehavior, i, 12);
        ViewParent parent = view2.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            if (view2.isAttachedToWindow()) {
                view2.post(runnableC9766e);
                return true;
            }
        }
        runnableC9766e.run();
        return true;
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        switch (this.f24878e) {
            case 0:
                ((InterfaceC8524e) obj).mo1492native(((C7422e) this.f24876e).ad, this.f24877e);
                return;
            default:
                InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                interfaceC8524e.subscription(this.f24877e, (C1962e) this.f24876e);
                return;
        }
    }

    @Override // defpackage.InterfaceC1360e
    public void vip(C4275e c4275e) {
        switch (this.f24878e) {
            case 2:
                C12318e c12318e = c4275e.ad;
                AbstractC17475e abstractC17475e = (AbstractC17475e) this.f24876e;
                if (c4275e.mo1580e()) {
                    C1410e c1410e = c4275e.signatures;
                    C1410e c1410e2 = c4275e.tapsense;
                    c4275e.pro = AbstractC17475e.remoteconfig(abstractC17475e);
                    C1410e m1517e = C4275e.m1517e(abstractC17475e, c4275e.remoteconfig, c4275e.isVip, c4275e.applovin, c4275e.f9371this);
                    c4275e.signatures = m1517e;
                    c4275e.tapsense = C4275e.m1518e(m1517e, c4275e.remoteconfig, c4275e.f9371this, c4275e.isVip, c4275e.applovin, c4275e.tapsense());
                    boolean equals = c4275e.signatures.equals(c1410e);
                    c4275e.tapsense.equals(c1410e2);
                    c12318e.getClass();
                    AbstractC2301e.subscription(Looper.myLooper() == c12318e.f24699e.getLooper());
                    InterfaceC17145e interfaceC17145e = c12318e.f24703e;
                    C13747e remoteconfig = interfaceC17145e.remoteconfig(c12318e, c4275e.tapsense);
                    if (!equals) {
                        interfaceC17145e.applovin();
                    }
                    remoteconfig.ad(new RunnableC16764e(c4275e, remoteconfig, this.f24877e, 6), EnumC3320e.f7489e);
                    return;
                }
                return;
            default:
                C12318e c12318e2 = c4275e.ad;
                List list = (List) this.f24876e;
                if (c4275e.mo1580e()) {
                    C1410e c1410e3 = c4275e.signatures;
                    C1410e c1410e4 = c4275e.tapsense;
                    c4275e.remoteconfig = AbstractC17475e.remoteconfig(list);
                    C1410e m1517e2 = C4275e.m1517e(c4275e.pro, list, c4275e.isVip, c4275e.applovin, c4275e.f9371this);
                    c4275e.signatures = m1517e2;
                    c4275e.tapsense = C4275e.m1518e(m1517e2, list, c4275e.f9371this, c4275e.isVip, c4275e.applovin, c4275e.tapsense());
                    boolean equals2 = c4275e.signatures.equals(c1410e3);
                    c4275e.tapsense.equals(c1410e4);
                    c12318e2.getClass();
                    AbstractC2301e.subscription(Looper.myLooper() == c12318e2.f24699e.getLooper());
                    InterfaceC17145e interfaceC17145e2 = c12318e2.f24703e;
                    C13747e remoteconfig2 = interfaceC17145e2.remoteconfig(c12318e2, c4275e.tapsense);
                    if (!equals2) {
                        interfaceC17145e2.applovin();
                    }
                    remoteconfig2.ad(new RunnableC16764e(c4275e, remoteconfig2, this.f24877e, 6), EnumC3320e.f7489e);
                    return;
                }
                return;
        }
    }
}
