package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۛؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5903e implements InterfaceC2839e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C7895e f12454e = AbstractC2358e.advert("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C3098e f12455e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f12456e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f12457e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Context f12458e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f12459e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C10850e f12460e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C17856e f12461e;

    public C5903e(Context context, C3098e c3098e, C17856e c17856e) {
        this.f12458e = context;
        this.f12455e = c3098e;
        this.f12461e = c17856e;
    }

    @Override // defpackage.InterfaceC2839e
    public final ArrayList ad(C15444e c15444e) {
        BinderC3838e binderC3838e;
        if (this.f12460e == null) {
            startapp();
        }
        C10850e c10850e = this.f12460e;
        AbstractC9528e.startapp(c10850e);
        if (!this.f12459e) {
            try {
                c10850e.m4155e(c10850e.m4156e(), 1);
                this.f12459e = true;
            } catch (RemoteException e) {
                throw new C15745e("Failed to init barcode scanner.", e);
            }
        }
        int i = c15444e.metrica;
        if (c15444e.purchase == 35) {
            Image.Plane[] ad = c15444e.ad();
            AbstractC9528e.startapp(ad);
            i = ad[0].getRowStride();
        }
        int i2 = c15444e.purchase;
        int i3 = c15444e.license;
        int yandex = AbstractC12220e.yandex(c15444e.appmetrica);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i4 = c15444e.purchase;
        if (i4 != -1) {
            if (i4 != 17) {
                if (i4 == 35) {
                    binderC3838e = new BinderC3838e(c15444e.vip != null ? (Image) c15444e.vip.f6092e : null);
                } else if (i4 != 842094169) {
                    throw new C15745e(AbstractC1786e.admob(c15444e.purchase, "Unsupported image format: "), 3);
                }
            }
            AbstractC9528e.startapp(null);
            throw null;
        }
        Bitmap bitmap = c15444e.ad;
        AbstractC9528e.startapp(bitmap);
        binderC3838e = new BinderC3838e(bitmap);
        try {
            Parcel m4156e = c10850e.m4156e();
            int i5 = AbstractC15518e.ad;
            m4156e.writeStrongBinder(binderC3838e);
            m4156e.writeInt(1);
            int applovin = AbstractC16852e.applovin(m4156e, 20293);
            AbstractC16852e.isPro(m4156e, 1, 4);
            m4156e.writeInt(i2);
            AbstractC16852e.isPro(m4156e, 2, 4);
            m4156e.writeInt(i);
            AbstractC16852e.isPro(m4156e, 3, 4);
            m4156e.writeInt(i3);
            AbstractC16852e.isPro(m4156e, 4, 4);
            m4156e.writeInt(yandex);
            AbstractC16852e.isPro(m4156e, 5, 8);
            m4156e.writeLong(elapsedRealtime);
            AbstractC16852e.ads(m4156e, applovin);
            Parcel m4154e = c10850e.m4154e(m4156e, 3);
            ArrayList createTypedArrayList = m4154e.createTypedArrayList(C16353e.CREATOR);
            m4154e.recycle();
            ArrayList arrayList = new ArrayList();
            Iterator it = createTypedArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(new C4896e(new C3432e((C16353e) it.next()), c15444e.billing));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new C15745e("Failed to run barcode scanner.", e2);
        }
    }

    @Override // defpackage.InterfaceC2839e
    public final void metrica() {
        C10850e c10850e = this.f12460e;
        if (c10850e != null) {
            try {
                c10850e.m4155e(c10850e.m4156e(), 2);
            } catch (RemoteException e) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e);
            }
            this.f12460e = null;
            this.f12459e = false;
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [eؚؗۘ, eؖۤۛ] */
    @Override // defpackage.InterfaceC2839e
    public final boolean startapp() {
        if (this.f12460e != null) {
            return this.f12457e;
        }
        Context context = this.f12458e;
        int ad = C0781e.ad(context, ModuleDescriptor.MODULE_ID);
        C17856e c17856e = this.f12461e;
        if (ad > 0) {
            this.f12457e = true;
            try {
                this.f12460e = vip(C0781e.metrica, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e) {
                throw new C15745e("Failed to create thick barcode scanner.", e);
            } catch (C15674e e2) {
                throw new C15745e("Failed to load the bundled barcode module.", e2);
            }
        } else {
            boolean z = false;
            this.f12457e = false;
            C1032e[] c1032eArr = AbstractC14014e.ad;
            C17991e.vip.getClass();
            int ad2 = C17991e.ad(context);
            C7895e c7895e = f12454e;
            if (ad2 >= 221500000) {
                try {
                    C0560e purchase = new AbstractC6950e(context, C4480e.smaato, InterfaceC12516e.ad, C16258e.metrica).purchase(new C6565e(AbstractC14014e.vip(AbstractC14014e.license, c7895e), 1));
                    C13023e c13023e = new C13023e(23);
                    purchase.getClass();
                    purchase.license(AbstractC10468e.ad, c13023e);
                    z = ((C9810e) AbstractC1749e.ad(purchase)).f19366e;
                } catch (InterruptedException | ExecutionException e3) {
                    Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e3);
                }
            } else {
                try {
                    C1911e listIterator = c7895e.listIterator(0);
                    while (listIterator.hasNext()) {
                        C0781e.metrica(context, C0781e.vip, (String) listIterator.next());
                    }
                    z = true;
                } catch (C15674e unused) {
                }
            }
            if (!z) {
                if (!this.f12456e) {
                    AbstractC14014e.ad(context, AbstractC2358e.advert("barcode", "tflite_dynamite"));
                    this.f12456e = true;
                }
                AbstractC4214e.vip(c17856e, EnumC3305e.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C15745e("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f12460e = vip(C0781e.vip, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | C15674e e4) {
                AbstractC4214e.vip(c17856e, EnumC3305e.OPTIONAL_MODULE_INIT_ERROR);
                throw new C15745e("Failed to create thin barcode scanner.", e4);
            }
        }
        AbstractC4214e.vip(c17856e, EnumC3305e.NO_ERROR);
        return this.f12457e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [eٖ٘ؔ] */
    public final C10850e vip(InterfaceC11232e interfaceC11232e, String str, String str2) {
        IInterface abstractC16277e;
        Context context = this.f12458e;
        IBinder vip = C0781e.metrica(context, interfaceC11232e, str).vip(str2);
        int i = AbstractBinderC18514e.license;
        C10850e c10850e = null;
        if (vip == null) {
            abstractC16277e = null;
        } else {
            IInterface queryLocalInterface = vip.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
            abstractC16277e = queryLocalInterface instanceof InterfaceC4496e ? (InterfaceC4496e) queryLocalInterface : new AbstractC16277e(vip, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator", 3);
        }
        BinderC3838e binderC3838e = new BinderC3838e(context);
        int i2 = this.f12455e.ad;
        C0706e c0706e = (C0706e) abstractC16277e;
        Parcel m4156e = c0706e.m4156e();
        int i3 = AbstractC15518e.ad;
        m4156e.writeStrongBinder(binderC3838e);
        m4156e.writeInt(1);
        int applovin = AbstractC16852e.applovin(m4156e, 20293);
        AbstractC16852e.isPro(m4156e, 1, 4);
        m4156e.writeInt(i2);
        AbstractC16852e.isPro(m4156e, 2, 4);
        m4156e.writeInt(0);
        AbstractC16852e.ads(m4156e, applovin);
        Parcel m4154e = c0706e.m4154e(m4156e, 1);
        IBinder readStrongBinder = m4154e.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            c10850e = queryLocalInterface2 instanceof C10850e ? (C10850e) queryLocalInterface2 : new AbstractC16277e(readStrongBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner", 3);
        }
        m4154e.recycle();
        return c10850e;
    }
}
