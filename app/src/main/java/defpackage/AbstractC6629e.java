package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.Surface;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۣۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6629e {
    public static final C5107e ad = new C5107e(27);

    public static C6799e ad() {
        return new C6799e(null);
    }

    public static final int adcel(InterfaceC9998e interfaceC9998e, AbstractC0232e abstractC0232e, String str) {
        C10195e c10195e = abstractC0232e.ad;
        loadAd(abstractC0232e, interfaceC9998e);
        int license = interfaceC9998e.license(str);
        if (license != -3 || !abstractC0232e.ad.adcel) {
            return license;
        }
        C15816e c15816e = abstractC0232e.metrica;
        C5625e c5625e = new C5625e(interfaceC9998e, abstractC0232e, 22);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c15816e.f31190e;
        Map map = (Map) concurrentHashMap.get(interfaceC9998e);
        C5107e c5107e = ad;
        Object obj = map != null ? map.get(c5107e) : null;
        Object obj2 = obj != null ? obj : null;
        if (obj2 == null) {
            obj2 = c5625e.invoke();
            Object obj3 = concurrentHashMap.get(interfaceC9998e);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(interfaceC9998e, obj3);
            }
            ((Map) obj3).put(c5107e, obj2);
        }
        Integer num = (Integer) ((Map) obj2).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final boolean advert(AbstractC0232e abstractC0232e, InterfaceC9998e interfaceC9998e) {
        if (abstractC0232e.ad.vip) {
            return true;
        }
        List annotations = interfaceC9998e.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof InterfaceC5941e) {
                return true;
            }
        }
        return false;
    }

    public static final boolean amazon(InterfaceC8850e interfaceC8850e) {
        InterfaceC10500e interfaceC10500e = (InterfaceC10500e) interfaceC8850e.mo397public(C4524e.f9798e);
        if (interfaceC10500e != null) {
            return interfaceC10500e.purchase();
        }
        return true;
    }

    public static final void appmetrica(InterfaceC10500e interfaceC10500e, String str, Throwable th) {
        interfaceC10500e.Signature(AbstractC7070e.ad(str, th));
    }

    public static final byte[] billing(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            if (i == 0) {
                String str = (String) charSequence;
                if (i2 == str.length()) {
                    return str.getBytes(charsetEncoder.charset());
                }
            }
            return ((String) charSequence).substring(i, i2).getBytes(charsetEncoder.charset());
        }
        ByteBuffer encode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i, i2));
        byte[] bArr = null;
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            byte[] array = encode.array();
            if (array.length == encode.remaining()) {
                bArr = array;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[encode.remaining()];
        encode.get(bArr2);
        return bArr2;
    }

    public static final void license(InterfaceC8850e interfaceC8850e, CancellationException cancellationException) {
        InterfaceC10500e interfaceC10500e = (InterfaceC10500e) interfaceC8850e.mo397public(C4524e.f9798e);
        if (interfaceC10500e != null) {
            interfaceC10500e.Signature(cancellationException);
        }
    }

    public static final void loadAd(AbstractC0232e abstractC0232e, InterfaceC9998e interfaceC9998e) {
        if (AbstractC7890e.billing(interfaceC9998e.appmetrica(), C6805e.appmetrica)) {
            C10195e c10195e = abstractC0232e.ad;
        }
    }

    public static float metrica(int i) {
        Set set = C9240e.f18442e;
        return i == 2 ? 840 : i == 1 ? 600 : 0;
    }

    public static final int mopub(InterfaceC9998e interfaceC9998e, AbstractC0232e abstractC0232e, String str, String str2) {
        int adcel = adcel(interfaceC9998e, abstractC0232e, str);
        if (adcel != -3) {
            return adcel;
        }
        throw new IllegalArgumentException(interfaceC9998e.ad() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final Object purchase(InterfaceC10500e interfaceC10500e, AbstractC10731e abstractC10731e) {
        interfaceC10500e.Signature(null);
        Object mo696protected = interfaceC10500e.mo696protected(abstractC10731e);
        return mo696protected == EnumC2821e.f6782e ? mo696protected : Unit.INSTANCE;
    }

    public static final InterfaceC1232e smaato(InterfaceC10500e interfaceC10500e, boolean z, AbstractC9832e abstractC9832e) {
        if (interfaceC10500e instanceof C6467e) {
            return ((C6467e) interfaceC10500e).m2179package(z, abstractC9832e);
        }
        return interfaceC10500e.inmobi(abstractC9832e.startapp(), new C2098e(1, abstractC9832e, AbstractC9832e.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 17), z);
    }

    public static final InterfaceC10500e startapp(InterfaceC8850e interfaceC8850e) {
        InterfaceC10500e interfaceC10500e = (InterfaceC10500e) interfaceC8850e.mo397public(C4524e.f9798e);
        if (interfaceC10500e != null) {
            return interfaceC10500e;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC8850e).toString());
    }

    public static final void vip(Surface surface, C16446e c16446e, InterfaceC14388e interfaceC14388e, C14434e c14434e) {
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            C17539e c17539e = c14434e.f28539e;
            EnumC7792e enumC7792e = c17539e.vip;
            Canvas canvas = AbstractC16863e.ad;
            C11648e c11648e = new C11648e();
            c11648e.ad = lockHardwareCanvas;
            float width = lockHardwareCanvas.getWidth();
            float height = lockHardwareCanvas.getHeight();
            long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
            InterfaceC14388e interfaceC14388e2 = c17539e.ad;
            EnumC7792e enumC7792e2 = c17539e.vip;
            InterfaceC14576e interfaceC14576e = c17539e.metrica;
            long j = c17539e.license;
            c17539e.ad = interfaceC14388e;
            c17539e.vip = enumC7792e;
            c17539e.metrica = c11648e;
            c17539e.license = floatToRawIntBits;
            c11648e.billing();
            C17138e.metrica(c14434e, c16446e);
            c11648e.admob();
            c17539e.ad = interfaceC14388e2;
            c17539e.vip = enumC7792e2;
            c17539e.metrica = interfaceC14576e;
            c17539e.license = j;
        } finally {
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public static final void yandex(InterfaceC8850e interfaceC8850e) {
        InterfaceC10500e interfaceC10500e = (InterfaceC10500e) interfaceC8850e.mo397public(C4524e.f9798e);
        if (interfaceC10500e != null && !interfaceC10500e.purchase()) {
            throw interfaceC10500e.mo695implements();
        }
    }
}
