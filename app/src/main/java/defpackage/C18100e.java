package defpackage;

import android.os.Handler;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18100e implements InterfaceC11659e, InterfaceC4243e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f35489e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f35490e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f35491e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f35492e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35493e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f35494e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f35495e;

    public C18100e(int i) {
        this.f35493e = i;
        switch (i) {
            case 4:
                this.f35492e = new Object();
                this.f35489e = new C17519e(0);
                return;
            default:
                return;
        }
    }

    public C18100e(InterfaceC4243e interfaceC4243e, InterfaceC0293e interfaceC0293e, InterfaceC0293e interfaceC0293e2, byte[] bArr) {
        this.f35493e = 2;
        this.f35492e = interfaceC4243e;
        this.f35489e = interfaceC0293e2;
        this.f35491e = ((interfaceC0293e2 instanceof InterfaceC0554e) && (interfaceC0293e2 instanceof InterfaceC1196e)) ? ((InterfaceC1196e) interfaceC0293e2).getByteLength() - 1 : Alert.DURATION_SHOW_INDEFINITELY;
        byte[] bArr2 = new byte[interfaceC0293e.getDigestSize()];
        this.f35495e = bArr2;
        interfaceC0293e.reset();
        if (bArr != null) {
            interfaceC0293e.update(bArr, 0, bArr.length);
        }
        interfaceC0293e.doFinal(bArr2, 0);
    }

    public C18100e(C14742e c14742e, AbstractC13616e abstractC13616e, int i, C12431e c12431e, C12431e c12431e2, boolean z) {
        this.f35493e = 1;
        this.f35494e = c14742e;
        this.f35492e = abstractC13616e;
        this.f35491e = i;
        this.f35489e = c12431e;
        this.f35495e = c12431e2;
        this.f35490e = z;
    }

    public C18100e(InterfaceC18435e interfaceC18435e, Celse celse) {
        this.f35493e = 5;
        this.f35489e = interfaceC18435e;
        this.f35495e = celse;
        Object obj = new Object();
        this.f35492e = obj;
        synchronized (obj) {
            this.f35494e = AbstractC5336e.purchase(interfaceC18435e, null, 0, new C17071e(this, null, 16), 3);
            Unit unit = Unit.INSTANCE;
        }
    }

    public C18100e(Object obj) {
        this.f35493e = 0;
        this.f35492e = new Object();
        this.f35491e = 0;
        this.f35490e = false;
        this.f35495e = new HashMap();
        this.f35494e = new CopyOnWriteArraySet();
        this.f35489e = new AtomicReference(obj);
    }

    private final void yandex() {
        ArrayList arrayList;
        synchronized (this.f35492e) {
            try {
                this.f35490e = true;
                arrayList = new ArrayList(((C2271e) this.f35489e).values());
                ((C2271e) this.f35489e).clear();
                if (((RunnableC6364e) this.f35495e) != null) {
                    Handler handler = (Handler) this.f35494e;
                    handler.getClass();
                    handler.post((RunnableC6364e) this.f35495e);
                    this.f35495e = null;
                    this.f35494e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C8342e) it.next()).admob();
        }
    }

    public boolean ad(int i, int i2) {
        C12431e c12431e = (C12431e) this.f35489e;
        int i3 = this.f35491e;
        InterfaceC8177e interfaceC8177e = (InterfaceC8177e) c12431e.f24870e[i + i3];
        InterfaceC8177e interfaceC8177e2 = (InterfaceC8177e) ((C12431e) this.f35495e).f24870e[i3 + i2];
        return AbstractC7890e.billing(interfaceC8177e, interfaceC8177e2) || interfaceC8177e.getClass() == interfaceC8177e2.getClass();
    }

    public void adcel(InterfaceC4868e interfaceC4868e) {
        RunnableC6903e runnableC6903e = (RunnableC6903e) ((HashMap) this.f35495e).remove(interfaceC4868e);
        if (runnableC6903e != null) {
            runnableC6903e.f14143e.set(false);
            ((CopyOnWriteArraySet) this.f35494e).remove(runnableC6903e);
        }
    }

    public void advert(Object obj) {
        Iterator it;
        int i;
        synchronized (this.f35492e) {
            try {
                if (Objects.equals(((AtomicReference) this.f35489e).getAndSet(obj), obj)) {
                    return;
                }
                int i2 = this.f35491e + 1;
                this.f35491e = i2;
                if (this.f35490e) {
                    return;
                }
                this.f35490e = true;
                Iterator it2 = ((CopyOnWriteArraySet) this.f35494e).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((RunnableC6903e) it2.next()).ad(i2);
                    } else {
                        synchronized (this.f35492e) {
                            try {
                                if (this.f35491e == i2) {
                                    this.f35490e = false;
                                    return;
                                } else {
                                    it = ((CopyOnWriteArraySet) this.f35494e).iterator();
                                    i = this.f35491e;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i2 = i;
                    }
                }
            } finally {
            }
        }
    }

    public void appmetrica(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        InterfaceC0293e interfaceC0293e = (InterfaceC0293e) this.f35489e;
        int digestSize = interfaceC0293e.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        byte[] bArr4 = new byte[4];
        int i6 = i4 + i3;
        int i7 = i6 - digestSize;
        interfaceC0293e.update(bArr, i, i2);
        if (i2 > this.f35491e) {
            InterfaceC0554e interfaceC0554e = (InterfaceC0554e) interfaceC0293e;
            InterfaceC0554e ad = interfaceC0554e.ad();
            i5 = 0;
            while (i3 < i7) {
                AbstractC3628e.billing(i5, 0, bArr4);
                interfaceC0293e.update(bArr4, 0, 4);
                interfaceC0293e.doFinal(bArr3, 0);
                interfaceC0554e.vip(ad);
                AbstractC4340e.yandex(bArr3, digestSize, 0, bArr2, i3);
                i3 += digestSize;
                i5++;
            }
        } else {
            int i8 = i3;
            int i9 = 0;
            while (i8 < i7) {
                AbstractC3628e.billing(i9, 0, bArr4);
                interfaceC0293e.update(bArr4, 0, 4);
                interfaceC0293e.doFinal(bArr3, 0);
                interfaceC0293e.update(bArr, i, i2);
                AbstractC4340e.yandex(bArr3, digestSize, 0, bArr2, i8);
                i8 += digestSize;
                i9++;
            }
            i5 = i9;
            i3 = i8;
        }
        AbstractC3628e.billing(i5, 0, bArr4);
        interfaceC0293e.update(bArr4, 0, 4);
        interfaceC0293e.doFinal(bArr3, 0);
        AbstractC4340e.yandex(bArr3, i6 - i3, 0, bArr2, i3);
    }

    public void billing() {
        switch (this.f35493e) {
            case 4:
                yandex();
                return;
            default:
                synchronized (this.f35492e) {
                    try {
                        if (this.f35490e) {
                            return;
                        }
                        this.f35490e = true;
                        C8419e c8419e = (C8419e) this.f35494e;
                        InterfaceC5083e interfaceC5083e = null;
                        if (c8419e != null) {
                            c8419e.Signature(null);
                        }
                        this.f35494e = null;
                        Unit unit = Unit.INSTANCE;
                        AbstractC5336e.purchase((InterfaceC18435e) this.f35489e, null, 0, new C18474e(this, interfaceC5083e, 29), 3);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    @Override // defpackage.InterfaceC4243e
    public int getInputBlockSize() {
        int inputBlockSize = ((InterfaceC4243e) this.f35492e).getInputBlockSize();
        return this.f35490e ? (inputBlockSize - 1) - (((byte[]) this.f35495e).length * 2) : inputBlockSize;
    }

    @Override // defpackage.InterfaceC4243e
    public int getOutputBlockSize() {
        int outputBlockSize = ((InterfaceC4243e) this.f35492e).getOutputBlockSize();
        return this.f35490e ? outputBlockSize : (outputBlockSize - 1) - (((byte[]) this.f35495e).length * 2);
    }

    @Override // defpackage.InterfaceC4243e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        SecureRandom secureRandom = null;
        SecureRandom secureRandom2 = interfaceC3894e instanceof C12219e ? ((C12219e) interfaceC3894e).f24538e : null;
        if (z) {
            if (secureRandom2 == null) {
                secureRandom2 = AbstractC9915e.vip();
            } else {
                ThreadLocal threadLocal = AbstractC9915e.ad;
            }
            secureRandom = secureRandom2;
        }
        this.f35494e = secureRandom;
        this.f35490e = z;
        ((InterfaceC4243e) this.f35492e).init(z, interfaceC3894e);
    }

    public C8342e license(Object obj) {
        C8342e c8342e;
        synchronized (this.f35492e) {
            try {
                int purchase = purchase();
                c8342e = new C8342e(purchase, obj);
                if (this.f35490e) {
                    c8342e.admob();
                } else {
                    ((C2271e) this.f35489e).put(Integer.valueOf(purchase), c8342e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8342e;
    }

    @Override // defpackage.InterfaceC11659e
    public void loadAd(InterfaceC4868e interfaceC4868e) {
        synchronized (this.f35492e) {
            adcel(interfaceC4868e);
        }
    }

    @Override // defpackage.InterfaceC11659e
    public void metrica(Executor executor, InterfaceC4868e interfaceC4868e) {
        RunnableC6903e runnableC6903e;
        synchronized (this.f35492e) {
            adcel(interfaceC4868e);
            runnableC6903e = new RunnableC6903e((AtomicReference) this.f35489e, executor, interfaceC4868e);
            ((HashMap) this.f35495e).put(interfaceC4868e, runnableC6903e);
            ((CopyOnWriteArraySet) this.f35494e).add(runnableC6903e);
        }
        runnableC6903e.ad(0);
    }

    public void mopub(int i, Object obj) {
        synchronized (this.f35492e) {
            try {
                C8342e c8342e = (C8342e) ((C2271e) this.f35489e).remove(Integer.valueOf(i));
                if (c8342e != null) {
                    if (c8342e.f17076e.getClass() == obj.getClass()) {
                        c8342e.smaato(obj);
                    } else {
                        AbstractC2803e.smaato("SequencedFutureManager", "Type mismatch, expected " + c8342e.f17076e.getClass() + ", but was " + obj.getClass());
                    }
                }
                if (((RunnableC6364e) this.f35495e) != null && ((C2271e) this.f35489e).isEmpty()) {
                    billing();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC4243e
    public byte[] processBlock(byte[] bArr, int i, int i2) {
        InterfaceC4243e interfaceC4243e = (InterfaceC4243e) this.f35492e;
        InterfaceC0293e interfaceC0293e = (InterfaceC0293e) this.f35489e;
        byte[] bArr2 = (byte[]) this.f35495e;
        if (this.f35490e) {
            int inputBlockSize = getInputBlockSize();
            if (i2 > inputBlockSize) {
                throw new RuntimeException("input data too long");
            }
            int length = (bArr2.length * 2) + inputBlockSize + 1;
            byte[] bArr3 = new byte[length];
            int i3 = length - i2;
            System.arraycopy(bArr, i, bArr3, i3, i2);
            bArr3[i3 - 1] = 1;
            System.arraycopy(bArr2, 0, bArr3, bArr2.length, bArr2.length);
            int length2 = bArr2.length;
            byte[] bArr4 = new byte[length2];
            ((SecureRandom) this.f35494e).nextBytes(bArr4);
            System.arraycopy(bArr4, 0, bArr3, 0, bArr2.length);
            interfaceC0293e.reset();
            appmetrica(bArr4, 0, length2, bArr3, bArr2.length, length - bArr2.length);
            appmetrica(bArr3, bArr2.length, length - bArr2.length, bArr3, 0, bArr2.length);
            return interfaceC4243e.processBlock(bArr3, 0, length);
        }
        int outputBlockSize = getOutputBlockSize();
        int outputBlockSize2 = interfaceC4243e.getOutputBlockSize();
        byte[] bArr5 = new byte[outputBlockSize2];
        byte[] processBlock = interfaceC4243e.processBlock(bArr, i, i2);
        int length3 = (outputBlockSize | (outputBlockSize2 - processBlock.length)) >> 31;
        int min = Math.min(outputBlockSize2, processBlock.length);
        System.arraycopy(processBlock, 0, bArr5, outputBlockSize2 - min, min);
        Arrays.fill(processBlock, (byte) 0);
        interfaceC0293e.reset();
        appmetrica(bArr5, bArr2.length, outputBlockSize2 - bArr2.length, bArr5, 0, bArr2.length);
        appmetrica(bArr5, 0, bArr2.length, bArr5, bArr2.length, outputBlockSize2 - bArr2.length);
        for (int i4 = 0; i4 != bArr2.length; i4++) {
            length3 |= bArr2[i4] ^ bArr5[bArr2.length + i4];
        }
        int i5 = -1;
        for (int length4 = bArr2.length * 2; length4 != outputBlockSize2; length4++) {
            i5 += (((-(bArr5[length4] & 255)) & i5) >> 31) & length4;
        }
        if (((i5 >> 31) | length3 | (bArr5[i5 + 1] ^ 1)) != 0) {
            Arrays.fill(bArr5, (byte) 0);
            throw new Exception("data wrong");
        }
        int i6 = i5 + 2;
        int i7 = outputBlockSize2 - i6;
        byte[] bArr6 = new byte[i7];
        System.arraycopy(bArr5, i6, bArr6, 0, i7);
        Arrays.fill(bArr5, (byte) 0);
        return bArr6;
    }

    public int purchase() {
        int i;
        synchronized (this.f35492e) {
            i = this.f35491e;
            this.f35491e = i + 1;
        }
        return i;
    }

    @Override // defpackage.InterfaceC11659e
    public ListenableFuture startapp() {
        Object obj = ((AtomicReference) this.f35489e).get();
        return obj instanceof AbstractC4907e ? new C4065e(1, null) : AbstractC15792e.mopub(obj);
    }

    public C10312e vip() {
        AbstractC9528e.metrica(((InterfaceC17847e) this.f35492e) != null, "Must set register function");
        AbstractC9528e.metrica(((InterfaceC17847e) this.f35489e) != null, "Must set unregister function");
        AbstractC9528e.metrica(((C2580e) this.f35495e) != null, "Must set holder");
        C9364e c9364e = (C9364e) ((C2580e) this.f35495e).vip;
        AbstractC9528e.adcel(c9364e, "Key must not be null");
        return new C10312e(new C0462e(this, (C2580e) this.f35495e, (C1032e[]) this.f35494e, this.f35490e, this.f35491e), new C7302e(this, c9364e, false, 2), 14);
    }
}
