package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.view.GestureDetector;
import android.view.View;
import android.widget.RemoteViews;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؑٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0381e {
    public final /* synthetic */ int ad;
    public Object appmetrica;
    public Object license;
    public boolean metrica;
    public int vip;

    public /* synthetic */ C0381e() {
        this.ad = 4;
    }

    public C0381e(Context context) {
        this.ad = 1;
        this.license = context;
        this.appmetrica = new C12582e(24);
        InterfaceC6823e interfaceC6823e = C3032e.yandex;
        this.vip = R.string.default_notification_channel_name;
    }

    public C0381e(Context context, C3049e c3049e) {
        this.ad = 2;
        this.license = c3049e;
        this.vip = 0;
        this.appmetrica = new GestureDetector(context, new GestureDetectorOnGestureListenerC0257e(this));
    }

    public C0381e(Parcel parcel) {
        this.ad = 5;
        int readInt = parcel.readInt();
        long[] jArr = new long[readInt];
        this.license = jArr;
        parcel.readLongArray(jArr);
        RemoteViews[] remoteViewsArr = new RemoteViews[readInt];
        parcel.readTypedArray(remoteViewsArr, RemoteViews.CREATOR);
        for (int i = 0; i < readInt; i++) {
            if (remoteViewsArr[i] == null) {
                throw new IllegalArgumentException("null element found in " + remoteViewsArr + '.');
            }
        }
        this.appmetrica = remoteViewsArr;
        this.metrica = parcel.readInt() == 1;
        this.vip = parcel.readInt();
    }

    public C0381e(BottomSheetBehavior bottomSheetBehavior) {
        this.ad = 0;
        this.appmetrica = bottomSheetBehavior;
        this.license = new RunnableC12991e(2, this);
    }

    public C0381e(SideSheetBehavior sideSheetBehavior) {
        this.ad = 6;
        this.appmetrica = sideSheetBehavior;
        this.license = new RunnableC1352e(2, this);
    }

    public C0381e(C6594e c6594e, boolean z, AbstractC7723e abstractC7723e, int i) {
        this.ad = 7;
        this.appmetrica = c6594e;
        this.metrica = z;
        this.license = abstractC7723e;
        this.vip = i;
    }

    public C0381e(C9321e c9321e, C1032e[] c1032eArr, boolean z, int i) {
        this.ad = 8;
        this.appmetrica = c9321e;
        this.license = c1032eArr;
        boolean z2 = false;
        if (c1032eArr != null && z) {
            z2 = true;
        }
        this.metrica = z2;
        this.vip = i;
    }

    public C0381e(boolean z, int i, String str, Bundle bundle) {
        this.ad = 3;
        this.metrica = z;
        this.vip = i;
        this.license = str;
        this.appmetrica = bundle == null ? Bundle.EMPTY : bundle;
    }

    public C0381e(boolean z, EnumC17116e enumC17116e, int i) {
        this.ad = 4;
        int i2 = enumC17116e.f33478e;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        this.appmetrica = enumC17116e;
        this.metrica = z;
        this.vip = i;
        allocate.put(z ? (byte) (i2 | 128) : (byte) i2);
        allocate.put((byte) ((16711680 & i) >>> 16));
        allocate.put((byte) ((65280 & i) >>> 8));
        allocate.put((byte) (i & 255));
        this.license = new byte[4];
        for (int i3 = 0; i3 < 4; i3++) {
            ((byte[]) this.license)[i3] = allocate.get(i3);
        }
    }

    public C0381e(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.ad = 5;
        this.license = jArr;
        this.appmetrica = remoteViewsArr;
        this.metrica = false;
        this.vip = 1;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = AbstractC13480e.premium(arrayList).size();
        if (size > 1) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("View type count is set to 1, but the collection contains ", size, " different layout ids").toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eًٍؘ, java.lang.Object] */
    public static C9321e ad() {
        ?? obj = new Object();
        obj.vip = false;
        obj.metrica = false;
        obj.appmetrica = 0;
        return obj;
    }

    public static C0381e license(FileChannel fileChannel) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        int read = fileChannel.read(allocate);
        if (read < 4) {
            throw new IOException(AbstractC1634e.smaato("Unable to read required number of databytes read:", read, ":required:4"));
        }
        allocate.rewind();
        C0381e c0381e = new C0381e();
        c0381e.metrica = ((allocate.get(0) & 128) >>> 7) == 1;
        int i = allocate.get(0) & Byte.MAX_VALUE;
        if (i >= EnumC17116e.values().length) {
            throw new C1110e("Flac file has invalid block type %s", Integer.valueOf(i));
        }
        c0381e.appmetrica = EnumC17116e.values()[i];
        c0381e.vip = ((allocate.get(1) & 255) << 16) + ((allocate.get(2) & 255) << 8) + (allocate.get(3) & 255);
        c0381e.license = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            ((byte[]) c0381e.license)[i2] = allocate.get(i2);
        }
        return c0381e;
    }

    public List appmetrica(CharSequence charSequence) {
        charSequence.getClass();
        Iterator m2224import = ((C6594e) this.appmetrica).m2224import(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            C12888e c12888e = (C12888e) m2224import;
            if (!c12888e.hasNext()) {
                return DesugarCollections.unmodifiableList(arrayList);
            }
            arrayList.add((String) c12888e.next());
        }
    }

    public byte[] metrica() {
        byte[] bArr = (byte[]) this.license;
        bArr[0] = (byte) (bArr[0] & Byte.MAX_VALUE);
        return bArr;
    }

    public String toString() {
        switch (this.ad) {
            case 4:
                return "BlockType:" + ((EnumC17116e) this.appmetrica) + " DataLength:" + this.vip + " isLastBlock:" + this.metrica;
            default:
                return super.toString();
        }
    }

    public void vip(int i) {
        switch (this.ad) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.appmetrica;
                WeakReference weakReference = bottomSheetBehavior.f780catch;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                this.vip = i;
                if (this.metrica) {
                    return;
                }
                View view = (View) bottomSheetBehavior.f780catch.get();
                RunnableC12991e runnableC12991e = (RunnableC12991e) this.license;
                WeakHashMap weakHashMap = AbstractC2016e.ad;
                view.postOnAnimation(runnableC12991e);
                this.metrica = true;
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.appmetrica;
                WeakReference weakReference2 = sideSheetBehavior.Signature;
                if (weakReference2 == null || weakReference2.get() == null) {
                    return;
                }
                this.vip = i;
                if (this.metrica) {
                    return;
                }
                View view2 = (View) sideSheetBehavior.Signature.get();
                RunnableC1352e runnableC1352e = (RunnableC1352e) this.license;
                WeakHashMap weakHashMap2 = AbstractC2016e.ad;
                view2.postOnAnimation(runnableC1352e);
                this.metrica = true;
                return;
        }
    }
}
