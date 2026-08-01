package defpackage;

import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.os.IInterface;
import android.util.Base64;
import android.util.JsonReader;
import android.view.Surface;
import android.view.contentcapture.ContentCaptureSession;
import androidx.car.app.ICarHost;
import androidx.car.app.hardware.ICarHardwareHost;
import androidx.car.app.navigation.model.Maneuver;
import com.google.firebase.components.ComponentRegistrar;
import java.security.GeneralSecurityException;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8391e implements InterfaceC13777e, InterfaceC3399e, InterfaceC14130e, InterfaceC12623e, InterfaceC8895e, InterfaceC2516e, InterfaceC9566e, InterfaceC9247e, InterfaceC16687e, InterfaceC14017e, InterfaceC7113e, InterfaceC11938e, InterfaceC9650e, InterfaceC2143e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17163e;

    public /* synthetic */ C8391e(int i) {
        this.f17163e = i;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession advert(Object obj) {
        return (ContentCaptureSession) obj;
    }

    @Override // defpackage.InterfaceC7113e
    public List ad(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // defpackage.InterfaceC12623e
    public Object adcel(IInterface iInterface) {
        return ICarHardwareHost.Stub.asInterface(((ICarHost) iInterface).getHost("hardware"));
    }

    @Override // defpackage.InterfaceC9650e
    public Object apply(Object obj) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [eؖۢؕ, java.lang.Object] */
    @Override // defpackage.InterfaceC2143e
    public Object appmetrica(JsonReader jsonReader) {
        boolean z;
        char c;
        String str = null;
        switch (this.f17163e) {
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                jsonReader.beginObject();
                String str2 = null;
                String str3 = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -609862170:
                            if (nextName.equals("libraryName")) {
                                z = false;
                                break;
                            }
                            break;
                        case 3002454:
                            if (nextName.equals("arch")) {
                                z = true;
                                break;
                            }
                            break;
                        case 230943785:
                            if (nextName.equals("buildId")) {
                                z = 2;
                                break;
                            }
                            break;
                    }
                    z = -1;
                    switch (z) {
                        case false:
                            str2 = jsonReader.nextString();
                            if (str2 == null) {
                                throw new NullPointerException("Null libraryName");
                            }
                            break;
                        case true:
                            str = jsonReader.nextString();
                            if (str == null) {
                                throw new NullPointerException("Null arch");
                            }
                            break;
                        case true:
                            str3 = jsonReader.nextString();
                            if (str3 == null) {
                                throw new NullPointerException("Null buildId");
                            }
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (str != null && str2 != null && str3 != null) {
                    return new C2826e(str, str2, str3);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" arch");
                }
                if (str2 == null) {
                    sb.append(" libraryName");
                }
                if (str3 == null) {
                    sb.append(" buildId");
                }
                throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                jsonReader.beginObject();
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (nextName2.equals("filename")) {
                        String nextString = jsonReader.nextString();
                        if (nextString == null) {
                            throw new NullPointerException("Null filename");
                        }
                        str = nextString;
                    } else if (nextName2.equals("contents")) {
                        bArr = Base64.decode(jsonReader.nextString(), 2);
                        if (bArr == null) {
                            throw new NullPointerException("Null contents");
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (str != null && bArr != null) {
                    return new C9063e(str, bArr);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str == null) {
                    sb2.append(" filename");
                }
                if (bArr == null) {
                    sb2.append(" contents");
                }
                throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb2));
            default:
                ?? obj = new Object();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.getClass();
                    switch (nextName3.hashCode()) {
                        case -1536268810:
                            if (nextName3.equals("parameterKey")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1027290370:
                            if (nextName3.equals("templateVersion")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1098747284:
                            if (nextName3.equals("rolloutVariant")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1124454216:
                            if (nextName3.equals("parameterValue")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    c = 65535;
                    switch (c) {
                        case 0:
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 == null) {
                                throw new NullPointerException("Null parameterKey");
                            }
                            obj.vip = nextString2;
                            break;
                        case 1:
                            obj.license = jsonReader.nextLong();
                            obj.appmetrica = (byte) (obj.appmetrica | 1);
                            break;
                        case 2:
                            jsonReader.beginObject();
                            String str4 = null;
                            String str5 = null;
                            while (jsonReader.hasNext()) {
                                String nextName4 = jsonReader.nextName();
                                nextName4.getClass();
                                if (nextName4.equals("variantId")) {
                                    str5 = jsonReader.nextString();
                                    if (str5 == null) {
                                        throw new NullPointerException("Null variantId");
                                    }
                                } else if (nextName4.equals("rolloutId")) {
                                    str4 = jsonReader.nextString();
                                    if (str4 == null) {
                                        throw new NullPointerException("Null rolloutId");
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            if (str4 != null && str5 != null) {
                                obj.ad = new C15373e(str4, str5);
                                break;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                if (str4 == null) {
                                    sb3.append(" rolloutId");
                                }
                                if (str5 == null) {
                                    sb3.append(" variantId");
                                }
                                throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb3));
                            }
                        case 3:
                            String nextString3 = jsonReader.nextString();
                            if (nextString3 == null) {
                                throw new NullPointerException("Null parameterValue");
                            }
                            obj.metrica = nextString3;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return obj.ad();
        }
    }

    @Override // defpackage.InterfaceC16687e
    public AbstractC14783e billing(InterfaceC8808e interfaceC8808e) {
        C12524e c12524e = (C12524e) interfaceC8808e;
        if (!c12524e.f25076e.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            C4922e crashlytics = C4922e.crashlytics(c12524e.f25073e, C5712e.ad());
            if (crashlytics.premium() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C8187e.smaato(AbstractC11489e.vip(c12524e.f25072e), new C17974e(23, C15768e.ad(crashlytics.ads().adcel())), c12524e.f25077e);
        } catch (C8868e unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    @Override // defpackage.InterfaceC3399e
    public void cancel() {
    }

    @Override // defpackage.InterfaceC8895e
    public Object license(AbstractC14783e abstractC14783e) {
        C8187e c8187e = (C8187e) abstractC14783e;
        try {
            C14868e.metrica();
            return new C14868e(((C15768e) c8187e.vip.f35233e).vip(), c8187e.metrica.vip(), C14868e.metrica().getProvider());
        } catch (GeneralSecurityException unused) {
            return new C17862e(((C15768e) c8187e.vip.f35233e).vip(), 1, c8187e.metrica.vip());
        }
    }

    @Override // defpackage.InterfaceC9566e
    public AbstractC12699e metrica(C17424e c17424e) {
        C7818e c7818e = (C7818e) c17424e.f34141e;
        if (!c7818e.firebase().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + c7818e.firebase());
        }
        try {
            C9193e.ads(c7818e.m2325class(), C5712e.ad());
            return new C11488e(AbstractC11489e.vip(c7818e.crashlytics()));
        } catch (C8868e e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    @Override // defpackage.InterfaceC14017e
    public double mopub(double d) {
        switch (this.f17163e) {
            case 14:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 15:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 16:
                float[] fArr = C4717e.ad;
                return C4717e.vip(C4717e.metrica, d);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                float[] fArr2 = C4717e.ad;
                return C4717e.ad(C4717e.metrica, d);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                float[] fArr3 = C4717e.ad;
                return C4717e.license(C4717e.license, d);
            default:
                float[] fArr4 = C4717e.ad;
                return C4717e.metrica(C4717e.license, d);
        }
    }

    @Override // defpackage.InterfaceC14130e
    public void onStopRecording() {
    }

    @Override // defpackage.InterfaceC9247e
    public C12524e purchase(AbstractC14783e abstractC14783e) {
        C8187e c8187e = (C8187e) abstractC14783e;
        C4841e subs = C4922e.subs();
        byte[] vip = ((C15768e) c8187e.vip.f35233e).vip();
        C2096e yandex = AbstractC10498e.yandex(0, vip.length, vip);
        subs.appmetrica();
        C4922e.applovin((C4922e) subs.f9709e, yandex);
        return C12524e.ad("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((C4922e) subs.ad()).purchase(), EnumC13541e.SYMMETRIC, AbstractC11489e.ad(c8187e.ad.ad), c8187e.license);
    }

    @Override // defpackage.InterfaceC13777e
    public void startapp(C6122e c6122e) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(c6122e.vip.getWidth(), c6122e.vip.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        c6122e.ad(surface, AbstractC3062e.billing(), new C2780e(surface, surfaceTexture, 0));
    }

    @Override // defpackage.InterfaceC11938e
    public void vip(C16465e c16465e) {
        PointF pointF = c16465e.ad;
        float f = pointF.x;
        pointF.x = pointF.y;
        pointF.y = f;
    }

    @Override // defpackage.InterfaceC2516e
    public C17424e yandex(AbstractC12699e abstractC12699e) {
        C2455e m2323interface = C7818e.m2323interface();
        m2323interface.yandex("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        m2323interface.startapp(C9193e.applovin().purchase());
        m2323interface.billing(AbstractC11489e.ad(((C11488e) abstractC12699e).ad));
        return C17424e.admob((C7818e) m2323interface.ad());
    }
}
