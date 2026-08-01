package defpackage;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؐۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8402e implements InterfaceC8668e, InterfaceC4843e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f17170e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final ArrayList f17171e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final ArrayList f17172e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f17173e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final LongSparseArray f17174e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C11606e f17175e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Executor f17176e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f17177e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C17687e f17178e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final LongSparseArray f17179e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f17180e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public InterfaceC14599e f17181e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C12309e f17182e;

    public C8402e(int i, int i2, int i3, int i4) {
        C12309e c12309e = new C12309e(ImageReader.newInstance(i, i2, i3, i4));
        this.f17180e = new Object();
        this.f17175e = new C11606e(2, this);
        this.f17173e = 0;
        this.f17178e = new C17687e(27, this);
        this.f17170e = false;
        this.f17179e = new LongSparseArray();
        this.f17174e = new LongSparseArray();
        this.f17171e = new ArrayList();
        this.f17182e = c12309e;
        this.f17177e = 0;
        this.f17172e = new ArrayList(isVip());
    }

    @Override // defpackage.InterfaceC4843e
    public final void ad(AbstractC1816e abstractC1816e) {
        synchronized (this.f17180e) {
            license(abstractC1816e);
        }
    }

    public final void adcel() {
        synchronized (this.f17180e) {
            try {
                if (this.f17174e.size() != 0 && this.f17179e.size() != 0) {
                    long keyAt = this.f17174e.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f17179e.keyAt(0);
                    AbstractC4265e.metrica(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f17174e.size() - 1; size >= 0; size--) {
                            if (this.f17174e.keyAt(size) < keyAt2) {
                                ((InterfaceC12385e) this.f17174e.valueAt(size)).close();
                                this.f17174e.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f17179e.size() - 1; size2 >= 0; size2--) {
                            if (this.f17179e.keyAt(size2) < keyAt) {
                                this.f17179e.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.InterfaceC8668e
    public final int appmetrica() {
        int appmetrica;
        synchronized (this.f17180e) {
            appmetrica = this.f17182e.appmetrica();
        }
        return appmetrica;
    }

    @Override // defpackage.InterfaceC8668e
    public final void billing() {
        synchronized (this.f17180e) {
            this.f17182e.billing();
            this.f17181e = null;
            this.f17176e = null;
            this.f17173e = 0;
        }
    }

    @Override // defpackage.InterfaceC8668e
    public final void close() {
        synchronized (this.f17180e) {
            try {
                if (this.f17170e) {
                    return;
                }
                Iterator it = new ArrayList(this.f17172e).iterator();
                while (it.hasNext()) {
                    ((InterfaceC12385e) it.next()).close();
                }
                this.f17172e.clear();
                this.f17182e.close();
                this.f17170e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC8668e
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f17180e) {
            surface = this.f17182e.getSurface();
        }
        return surface;
    }

    @Override // defpackage.InterfaceC8668e
    public final int getWidth() {
        int width;
        synchronized (this.f17180e) {
            width = this.f17182e.getWidth();
        }
        return width;
    }

    @Override // defpackage.InterfaceC8668e
    public final InterfaceC12385e inmobi() {
        synchronized (this.f17180e) {
            try {
                if (this.f17172e.isEmpty()) {
                    return null;
                }
                if (this.f17177e >= this.f17172e.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.f17172e;
                int i = this.f17177e;
                this.f17177e = i + 1;
                InterfaceC12385e interfaceC12385e = (InterfaceC12385e) arrayList.get(i);
                this.f17171e.add(interfaceC12385e);
                return interfaceC12385e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC8668e
    public final int isVip() {
        int isVip;
        synchronized (this.f17180e) {
            isVip = this.f17182e.isVip();
        }
        return isVip;
    }

    public final void license(AbstractC1816e abstractC1816e) {
        synchronized (this.f17180e) {
            try {
                int indexOf = this.f17172e.indexOf(abstractC1816e);
                if (indexOf >= 0) {
                    this.f17172e.remove(indexOf);
                    int i = this.f17177e;
                    if (indexOf <= i) {
                        this.f17177e = i - 1;
                    }
                }
                this.f17171e.remove(abstractC1816e);
                if (this.f17173e > 0) {
                    yandex(this.f17182e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC8668e
    public final InterfaceC12385e metrica() {
        synchronized (this.f17180e) {
            try {
                if (this.f17172e.isEmpty()) {
                    return null;
                }
                if (this.f17177e >= this.f17172e.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.f17172e.size() - 1; i++) {
                    if (!this.f17171e.contains(this.f17172e.get(i))) {
                        arrayList.add((InterfaceC12385e) this.f17172e.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC12385e) it.next()).close();
                }
                int size = this.f17172e.size();
                ArrayList arrayList2 = this.f17172e;
                this.f17177e = size;
                InterfaceC12385e interfaceC12385e = (InterfaceC12385e) arrayList2.get(size - 1);
                this.f17171e.add(interfaceC12385e);
                return interfaceC12385e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC8668e
    public final void pro(InterfaceC14599e interfaceC14599e, Executor executor) {
        synchronized (this.f17180e) {
            interfaceC14599e.getClass();
            this.f17181e = interfaceC14599e;
            executor.getClass();
            this.f17176e = executor;
            this.f17182e.pro(this.f17178e, executor);
        }
    }

    public final void purchase(C5403e c5403e) {
        InterfaceC14599e interfaceC14599e;
        Executor executor;
        synchronized (this.f17180e) {
            try {
                if (this.f17172e.size() < isVip()) {
                    c5403e.ad(this);
                    this.f17172e.add(c5403e);
                    interfaceC14599e = this.f17181e;
                    executor = this.f17176e;
                } else {
                    AbstractC9464e.yandex("TAG", "Maximum image number reached.");
                    c5403e.close();
                    interfaceC14599e = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC14599e != null) {
            if (executor != null) {
                executor.execute(new RunnableC7410e(this, interfaceC14599e, 25));
            } else {
                interfaceC14599e.metrica(this);
            }
        }
    }

    public final void startapp() {
        synchronized (this.f17180e) {
            try {
                for (int size = this.f17179e.size() - 1; size >= 0; size--) {
                    InterfaceC10073e interfaceC10073e = (InterfaceC10073e) this.f17179e.valueAt(size);
                    long metrica = interfaceC10073e.metrica();
                    InterfaceC12385e interfaceC12385e = (InterfaceC12385e) this.f17174e.get(metrica);
                    if (interfaceC12385e != null) {
                        this.f17174e.remove(metrica);
                        this.f17179e.removeAt(size);
                        purchase(new C5403e(interfaceC12385e, null, interfaceC10073e));
                    }
                }
                adcel();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC8668e
    public final int vip() {
        int vip;
        synchronized (this.f17180e) {
            vip = this.f17182e.vip();
        }
        return vip;
    }

    public final void yandex(InterfaceC8668e interfaceC8668e) {
        InterfaceC12385e interfaceC12385e;
        synchronized (this.f17180e) {
            try {
                if (this.f17170e) {
                    return;
                }
                int size = this.f17174e.size() + this.f17172e.size();
                if (size >= interfaceC8668e.isVip()) {
                    AbstractC9464e.yandex("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        interfaceC12385e = interfaceC8668e.inmobi();
                        if (interfaceC12385e != null) {
                            this.f17173e--;
                            size++;
                            this.f17174e.put(interfaceC12385e.mo691synchronized().metrica(), interfaceC12385e);
                            startapp();
                        }
                    } catch (IllegalStateException e) {
                        AbstractC9464e.startapp("MetadataImageReader", "Failed to acquire next image.", e);
                        interfaceC12385e = null;
                    }
                    if (interfaceC12385e == null || this.f17173e <= 0) {
                        break;
                    }
                } while (size < interfaceC8668e.isVip());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
