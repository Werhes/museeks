package defpackage;

import android.location.Location;
import android.net.Uri;
import android.os.IInterface;
import android.util.Log;
import androidx.car.app.IAppHost;
import androidx.car.app.media.OpenMicrophoneRequest;
import androidx.car.app.media.OpenMicrophoneResponse;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.TemplateInfo;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0211e implements InterfaceC16080e, InterfaceC17091e, InterfaceC12623e, InterfaceC13995e, InterfaceC12523e, InterfaceC14599e, InterfaceC14130e, InterfaceC7898e, InterfaceC9307e, InterfaceC5808e, InterfaceC13824e, InterfaceC0771e, InterfaceC8427e, InterfaceC11929e, InterfaceC9650e, InterfaceC6269e, InterfaceC12504e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f1457e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1458e;

    public /* synthetic */ C0211e(int i, Object obj) {
        this.f1458e = i;
        this.f1457e = obj;
    }

    private final Object mopub(C7169e c7169e) {
        C13945e c13945e = (C13945e) this.f1457e;
        c13945e.amazon.billing();
        if (c13945e.loadAd.ad()) {
            C4909e c4909e = (C4909e) c13945e.loadAd.getValue();
            synchronized (c4909e.ad) {
                c4909e.vip.disable();
                c4909e.metrica.clear();
                c4909e.license = -1;
                Unit unit = Unit.INSTANCE;
            }
        }
        c13945e.ad.vip().ad(new RunnableC16019e(c13945e, c7169e, 19), c13945e.license);
        return "CameraX shutdownInternal";
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        ((C15683e) obj).ad((C8455e) this.f1457e);
    }

    @Override // defpackage.InterfaceC13995e
    public Object ad() {
        TemplateWrapper templateWrapper;
        C18047e c18047e = (C18047e) this.f1457e;
        AbstractC14524e.ad();
        AbstractC14524e.ad();
        ArrayDeque arrayDeque = c18047e.ad;
        C6436e c6436e = (C6436e) arrayDeque.peek();
        Objects.requireNonNull(c6436e);
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "Requesting template from Screen " + c6436e);
        }
        PaneTemplate license = c6436e.license();
        TemplateWrapper wrap = (!c6436e.f13326e || (templateWrapper = c6436e.f13324e) == null) ? TemplateWrapper.wrap(license) : TemplateWrapper.wrap(license, new TemplateInfo(templateWrapper.getTemplate().getClass(), templateWrapper.getId()).getTemplateId());
        c6436e.f13326e = false;
        c6436e.f13324e = wrap;
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "Returning " + license + " from screen " + c6436e);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            C6436e c6436e2 = (C6436e) it.next();
            if (c6436e2.f13324e == null) {
                c6436e2.f13324e = TemplateWrapper.wrap(c6436e2.license());
            }
            arrayList.add(new TemplateInfo(c6436e2.f13324e.getTemplate().getClass(), c6436e2.f13324e.getId()));
        }
        wrap.setTemplateInfosForScreenStack(arrayList);
        return wrap;
    }

    @Override // defpackage.InterfaceC12623e
    public Object adcel(IInterface iInterface) {
        switch (this.f1458e) {
            case 2:
                try {
                    C10147e openMicrophone = ((IAppHost) iInterface).openMicrophone(new C10147e((OpenMicrophoneRequest) this.f1457e));
                    if (openMicrophone == null) {
                        return null;
                    }
                    return (OpenMicrophoneResponse) openMicrophone.ad();
                } catch (C9496e e) {
                    Log.e("CarApp", "Cannot open microphone", e);
                    return null;
                }
            default:
                ((IAppHost) iInterface).sendLocation((Location) this.f1457e);
                return null;
        }
    }

    @Override // defpackage.InterfaceC0771e
    public Object advert(C0560e c0560e) {
        switch (this.f1458e) {
            case 21:
                return (C0560e) ((CallableC9235e) this.f1457e).call();
            default:
                ((Runnable) this.f1457e).run();
                return AbstractC1749e.appmetrica(null);
        }
    }

    @Override // defpackage.InterfaceC12523e
    public Object amazon(C7169e c7169e) {
        switch (this.f1458e) {
            case 6:
                C3862e c3862e = (C3862e) this.f1457e;
                synchronized (c3862e.ad) {
                    c3862e.appmetrica = c7169e;
                }
                return "CameraRepository-deinit";
            case 7:
                return mopub(c7169e);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C8763e c8763e = (C8763e) this.f1457e;
                c8763e.mo692else(new C5337e(c7169e, c8763e, 8));
                return "Deferred.asListenableFuture";
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C6467e) this.f1457e).mo692else(new C10739e(6, c7169e));
                return "Job.asListenableFuture";
            default:
                C9396e c9396e = (C9396e) this.f1457e;
                c9396e.f18693e.yandex.execute(new RunnableC2623e(c9396e, c7169e, 15));
                return "fetchData";
        }
    }

    @Override // defpackage.InterfaceC9650e
    public Object apply(Object obj) {
        return Long.valueOf(((C18405e) this.f1457e).mopub(((Long) obj).longValue()));
    }

    @Override // defpackage.InterfaceC6269e
    public Uri appmetrica(Uri uri) {
        return uri;
    }

    @Override // defpackage.InterfaceC6269e
    public C2435e billing(C2435e c2435e) {
        String str = (String) ((Function0) this.f1457e).invoke();
        if (str == null) {
            return c2435e;
        }
        Map singletonMap = Collections.singletonMap("Authorization", str);
        c2435e.getClass();
        HashMap hashMap = new HashMap(c2435e.appmetrica);
        hashMap.putAll(singletonMap);
        return new C2435e(c2435e.ad, c2435e.vip, c2435e.metrica, c2435e.license, hashMap, c2435e.purchase, c2435e.billing, c2435e.yandex, c2435e.startapp, c2435e.adcel);
    }

    @Override // defpackage.InterfaceC9307e
    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public void mo268e(Exception exc) {
        switch (this.f1458e) {
            case 12:
                C3409e c3409e = (C3409e) this.f1457e;
                exc.printStackTrace();
                c3409e.m1357synchronized(new C1656e(exc));
                return;
            default:
                C1963e c1963e = (C1963e) this.f1457e;
                exc.printStackTrace();
                c1963e.m735import(new C5561e(exc));
                return;
        }
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        ((InterfaceC8524e) obj).isPro((C9039e) this.f1457e);
    }

    @Override // defpackage.InterfaceC7898e
    public void license(Object obj) {
        switch (this.f1458e) {
            case 11:
                ((C0609e) this.f1457e).invoke(obj);
                return;
            default:
                ((C12875e) this.f1457e).invoke(obj);
                return;
        }
    }

    @Override // defpackage.InterfaceC14599e
    public void metrica(InterfaceC8668e interfaceC8668e) {
        ((C0909e) this.f1457e).getClass();
        try {
            InterfaceC12385e metrica = interfaceC8668e.metrica();
            StringBuilder sb = new StringBuilder("OnImageAvailableListener: mCurrentRequest ID = null, image.isNull = ");
            sb.append(metrica == null);
            AbstractC9464e.yandex("CaptureNode", sb.toString());
            if (metrica != null) {
                AbstractC13062e.metrica();
                AbstractC9464e.remoteconfig("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + metrica);
                metrica.close();
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.InterfaceC14130e
    public void onStopRecording() {
        AbstractC1815e.ad((AbstractC1815e) this.f1457e);
    }

    @Override // defpackage.InterfaceC17091e
    public void purchase(Object obj) {
        ((Function1) ((InterfaceC3314e) this.f1457e).getValue()).invoke(obj);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:66|67|(2:70|68)|71|72|(1:74)(1:151)|(1:76)|77|(5:138|(1:140)|141|458|146)(1:81)|82|(17:86|(1:88)(2:134|(1:136))|89|90|(2:92|(1:94))(2:130|(2:132|133))|95|96|97|98|99|100|101|(3:122|(1:124)|125)(3:109|(1:111)|112)|113|114|(2:116|(1:118))|119)|137|90|(0)(0)|95|96|97|98|99|100|101|(2:103|105)|122|(0)|125|113|114|(0)|119) */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0603, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0620, code lost:
    
        android.util.Log.e(r8, "Crashlytics was not started due to an exception during initialization", r0);
        r6.billing = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04b7  */
    /* JADX WARN: Type inference failed for: r10v3, types: [eٔؒۤ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, eؗ٘ٔ] */
    @Override // defpackage.InterfaceC5808e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object smaato(defpackage.C18464e r50) {
        /*
            Method dump skipped, instructions count: 1716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0211e.smaato(eۣۡ):java.lang.Object");
    }

    public C15475e startapp(C18478e c18478e) {
        C6803e c6803e = (C6803e) this.f1457e;
        URL url = (URL) c18478e.f36228e;
        String mopub = AbstractC12640e.mopub("CctTransportBackend");
        if (Log.isLoggable(mopub, 4)) {
            Log.i(mopub, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c6803e.billing);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) c18478e.f36229e;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C16089e c16089e = c6803e.ad;
                    C4481e c4481e = (C4481e) c18478e.f36227e;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C10610e c10610e = (C10610e) c16089e.f31681e;
                    C6722e c6722e = new C6722e(bufferedWriter, c10610e.f20919e, c10610e.f20917e, c10610e.f20916e, c10610e.f20918e);
                    c6722e.yandex(c4481e);
                    c6722e.adcel();
                    c6722e.vip.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String mopub2 = AbstractC12640e.mopub("CctTransportBackend");
                    if (Log.isLoggable(mopub2, 4)) {
                        Log.i(mopub2, String.format("Status Code: %d", valueOf));
                    }
                    AbstractC12640e.billing("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC12640e.billing("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C15475e(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C15475e(responseCode, (URL) null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C15475e c15475e = new C15475e(responseCode, (URL) null, C11619e.ad(new BufferedReader(new InputStreamReader(gZIPInputStream))).ad);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c15475e;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (C14060e e) {
            e = e;
            AbstractC12640e.yandex("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C15475e(400, (URL) null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            AbstractC12640e.yandex("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C15475e(500, (URL) null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            AbstractC12640e.yandex("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C15475e(500, (URL) null, 0L);
        } catch (IOException e4) {
            e = e4;
            AbstractC12640e.yandex("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C15475e(400, (URL) null, 0L);
        }
    }

    @Override // defpackage.InterfaceC11929e
    public C1410e vip(int i, C16437e c16437e, int[] iArr) {
        C16672e c16672e = (C16672e) this.f1457e;
        C13304e Signature = AbstractC17475e.Signature();
        for (int i2 = 0; i2 < c16437e.ad; i2++) {
            Signature.metrica(new C1280e(i, c16437e, i2, c16672e, iArr[i2]));
        }
        return Signature.billing();
    }

    @Override // defpackage.InterfaceC13824e
    public void yandex(InterfaceC7970e interfaceC7970e) {
        C12787e c12787e = (C12787e) this.f1457e;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        c12787e.vip.set((C12787e) interfaceC7970e.get());
    }
}
