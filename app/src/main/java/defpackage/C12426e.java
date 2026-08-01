package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12426e implements InterfaceC14209e {
    public OutputStream ad;
    public final C12831e appmetrica = new C12831e(this, 0);
    public final InterfaceC1848e license;
    public final HashMap metrica;
    public final HashMap vip;
    public static final Charset purchase = Charset.forName("UTF-8");
    public static final C7369e billing = new C7369e("key", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(1))));
    public static final C7369e yandex = new C7369e("value", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(2))));
    public static final C16366e startapp = new C16366e(1);

    public C12426e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, InterfaceC1848e interfaceC1848e) {
        this.ad = byteArrayOutputStream;
        this.vip = hashMap;
        this.metrica = hashMap2;
        this.license = interfaceC1848e;
    }

    public static int adcel(C7369e c7369e) {
        InterfaceC10332e interfaceC10332e = (InterfaceC10332e) c7369e.vip(InterfaceC10332e.class);
        if (interfaceC10332e != null) {
            return ((C4207e) interfaceC10332e).vip;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // defpackage.InterfaceC14209e
    public final InterfaceC14209e ad(C7369e c7369e, Object obj) {
        yandex(c7369e, obj, true);
        return this;
    }

    public final void advert(long j) {
        while (((-128) & j) != 0) {
            this.ad.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.ad.write(((int) j) & 127);
    }

    @Override // defpackage.InterfaceC14209e
    public final InterfaceC14209e appmetrica(C7369e c7369e, int i) {
        metrica(c7369e, i, true);
        return this;
    }

    @Override // defpackage.InterfaceC14209e
    public final InterfaceC14209e billing(C7369e c7369e, long j) {
        if (j == 0) {
            return this;
        }
        InterfaceC10332e interfaceC10332e = (InterfaceC10332e) c7369e.vip(InterfaceC10332e.class);
        if (interfaceC10332e == null) {
            throw new RuntimeException("Field has no @Protobuf config");
        }
        mopub(((C4207e) interfaceC10332e).vip << 3);
        advert(j);
        return this;
    }

    @Override // defpackage.InterfaceC14209e
    public final InterfaceC14209e license(C7369e c7369e, boolean z) {
        metrica(c7369e, z ? 1 : 0, true);
        return this;
    }

    public final void metrica(C7369e c7369e, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        InterfaceC10332e interfaceC10332e = (InterfaceC10332e) c7369e.vip(InterfaceC10332e.class);
        if (interfaceC10332e == null) {
            throw new RuntimeException("Field has no @Protobuf config");
        }
        mopub(((C4207e) interfaceC10332e).vip << 3);
        mopub(i);
    }

    public final void mopub(int i) {
        while ((i & (-128)) != 0) {
            this.ad.write((i & 127) | 128);
            i >>>= 7;
        }
        this.ad.write(i & 127);
    }

    @Override // defpackage.InterfaceC14209e
    public final InterfaceC14209e purchase(C7369e c7369e, double d) {
        vip(c7369e, d, true);
        return this;
    }

    public final void startapp(InterfaceC1848e interfaceC1848e, C7369e c7369e, Object obj, boolean z) {
        C16644e c16644e = new C16644e(0);
        c16644e.f32665e = 0L;
        try {
            OutputStream outputStream = this.ad;
            this.ad = c16644e;
            try {
                interfaceC1848e.ad(obj, this);
                this.ad = outputStream;
                long j = c16644e.f32665e;
                c16644e.close();
                if (z && j == 0) {
                    return;
                }
                mopub((adcel(c7369e) << 3) | 2);
                advert(j);
                interfaceC1848e.ad(obj, this);
            } catch (Throwable th) {
                this.ad = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c16644e.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void vip(C7369e c7369e, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        mopub((adcel(c7369e) << 3) | 1);
        this.ad.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void yandex(C7369e c7369e, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            mopub((adcel(c7369e) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(purchase);
            mopub(bytes.length);
            this.ad.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                yandex(c7369e, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                startapp(startapp, c7369e, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            vip(c7369e, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            mopub((adcel(c7369e) << 3) | 5);
            this.ad.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z && longValue == 0) {
                return;
            }
            InterfaceC10332e interfaceC10332e = (InterfaceC10332e) c7369e.vip(InterfaceC10332e.class);
            if (interfaceC10332e == null) {
                throw new RuntimeException("Field has no @Protobuf config");
            }
            mopub(((C4207e) interfaceC10332e).vip << 3);
            advert(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            metrica(c7369e, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            mopub((adcel(c7369e) << 3) | 2);
            mopub(bArr.length);
            this.ad.write(bArr);
            return;
        }
        InterfaceC1848e interfaceC1848e = (InterfaceC1848e) this.vip.get(obj.getClass());
        if (interfaceC1848e != null) {
            startapp(interfaceC1848e, c7369e, obj, z);
            return;
        }
        InterfaceC18171e interfaceC18171e = (InterfaceC18171e) this.metrica.get(obj.getClass());
        if (interfaceC18171e != null) {
            C12831e c12831e = this.appmetrica;
            c12831e.vip = false;
            c12831e.license = c7369e;
            c12831e.metrica = z;
            interfaceC18171e.ad(obj, c12831e);
            return;
        }
        if (obj instanceof InterfaceC9891e) {
            metrica(c7369e, ((InterfaceC9891e) obj).ad(), true);
        } else if (obj instanceof Enum) {
            metrica(c7369e, ((Enum) obj).ordinal(), true);
        } else {
            startapp(this.license, c7369e, obj, z);
        }
    }
}
