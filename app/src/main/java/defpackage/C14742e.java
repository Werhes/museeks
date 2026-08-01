package defpackage;

import android.net.Uri;
import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14742e {
    public final /* synthetic */ int ad;
    public Object adcel;
    public Object appmetrica;
    public Object billing;
    public Object license;
    public Object metrica;
    public Object mopub;
    public Object purchase;
    public Object startapp;
    public Object vip;
    public Object yandex;

    public /* synthetic */ C14742e(int i) {
        this.ad = i;
    }

    public C14742e(C13915e c13915e) {
        this.ad = 3;
        this.vip = c13915e;
        AbstractC13616e abstractC13616e = new AbstractC13616e();
        abstractC13616e.f27020e = -1;
        this.metrica = abstractC13616e;
        C14747e c14747e = new C14747e(c13915e);
        this.license = c14747e;
        this.appmetrica = c14747e;
        C9011e c9011e = c14747e.f29169e;
        this.purchase = c9011e;
        this.billing = c9011e;
        this.adcel = new C12431e(0, new InterfaceC12864e[16]);
    }

    public C14742e(C17148e c17148e, SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e, C17381e c17381e, int i, int i2, int i3, int i4) {
        this.ad = 4;
        this.vip = c17148e;
        this.license = surfaceHolderCallbackC0960e;
        this.appmetrica = c17381e;
        this.purchase = new C6158e();
        this.billing = c17381e.ad(c17148e.f33576e, new C3275e(3, this));
        this.yandex = new C8789e(this, i);
        this.startapp = new C2810e(this, i2);
        this.adcel = new C9241e(this, i3);
        this.mopub = new C17493e(this, i4);
        C12959e c12959e = new C12959e(2, this);
        this.metrica = c12959e;
        c17148e.f33577e.ad(c12959e);
    }

    public C14742e(String str, C13747e c13747e, C0492e c0492e, Executor executor, C6843e c6843e, C4842e c4842e, C9838e c9838e) {
        this.ad = 5;
        this.startapp = new Object();
        this.adcel = new C16911e(22);
        this.mopub = null;
        this.vip = str;
        this.metrica = AbstractC2017e.appmetrica(c13747e);
        this.license = c0492e;
        this.appmetrica = new ExecutorC12022e(executor);
        this.purchase = c6843e;
        this.billing = c4842e;
        this.yandex = c9838e;
    }

    public C14742e(Csuper csuper, C11388e c11388e, C0909e c0909e, Function1 function1, C13732e c13732e, C7102e c7102e, Function0 function0, InterfaceC11678e interfaceC11678e, Function1 function12) {
        this.ad = 0;
        this.metrica = csuper;
        this.license = c11388e;
        this.appmetrica = c0909e;
        this.purchase = function1;
        this.yandex = c13732e;
        this.startapp = c7102e;
        this.adcel = function0;
        this.mopub = interfaceC11678e;
        this.billing = function12;
        this.vip = csuper;
    }

    public static final void ad(C14742e c14742e, AbstractC13616e abstractC13616e, AbstractC17732e abstractC17732e) {
        for (AbstractC13616e abstractC13616e2 = abstractC13616e.f27011e; abstractC13616e2 != null; abstractC13616e2 = abstractC13616e2.f27011e) {
            if (abstractC13616e2 == ((C16076e) c14742e.metrica)) {
                C13915e tapsense = ((C13915e) c14742e.vip).tapsense();
                abstractC17732e.f34794e = tapsense != null ? (C14747e) tapsense.f27592e.license : null;
                c14742e.appmetrica = abstractC17732e;
                return;
            } else {
                if ((abstractC13616e2.f27014e & 2) != 0) {
                    return;
                }
                abstractC13616e2.mo2043e(abstractC17732e);
            }
        }
    }

    public static void amazon(InterfaceC8177e interfaceC8177e, InterfaceC8177e interfaceC8177e2, AbstractC13616e abstractC13616e) {
        if ((interfaceC8177e instanceof AbstractC11865e) && (interfaceC8177e2 instanceof AbstractC11865e)) {
            ((AbstractC11865e) interfaceC8177e2).yandex(abstractC13616e);
            if (abstractC13616e.f27016e) {
                AbstractC5180e.metrica(abstractC13616e);
                return;
            } else {
                abstractC13616e.f27015e = true;
                return;
            }
        }
        if (!(abstractC13616e instanceof C5552e)) {
            AbstractC14070e.metrica("Unknown Modifier.Node type");
            return;
        }
        C5552e c5552e = (C5552e) abstractC13616e;
        boolean z = c5552e.f27016e;
        if (z) {
            if (!z) {
                AbstractC14070e.metrica("unInitializeModifier called on unattached node");
            }
            if ((c5552e.f27014e & 8) != 0) {
                ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(c5552e)).crashlytics();
            }
        }
        c5552e.f11884e = interfaceC8177e2;
        c5552e.f27014e = AbstractC5180e.license(interfaceC8177e2);
        if (c5552e.f27016e) {
            c5552e.m1940e(false);
        }
        if (abstractC13616e.f27016e) {
            AbstractC5180e.metrica(abstractC13616e);
        } else {
            abstractC13616e.f27015e = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eؘَؗ, eْۤۡ] */
    public static AbstractC13616e appmetrica(InterfaceC8177e interfaceC8177e, AbstractC13616e abstractC13616e) {
        AbstractC13616e abstractC13616e2;
        if (interfaceC8177e instanceof AbstractC11865e) {
            abstractC13616e2 = ((AbstractC11865e) interfaceC8177e).vip();
            abstractC13616e2.f27014e = AbstractC5180e.purchase(abstractC13616e2);
        } else {
            ?? abstractC13616e3 = new AbstractC13616e();
            abstractC13616e3.f27014e = AbstractC5180e.license(interfaceC8177e);
            abstractC13616e3.f11884e = interfaceC8177e;
            abstractC13616e3.f11885e = new HashSet();
            abstractC13616e2 = abstractC13616e3;
        }
        if (abstractC13616e2.f27016e) {
            AbstractC14070e.metrica("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        abstractC13616e2.f27021e = true;
        AbstractC13616e abstractC13616e4 = abstractC13616e.f27024e;
        if (abstractC13616e4 != null) {
            abstractC13616e4.f27011e = abstractC13616e2;
            abstractC13616e2.f27024e = abstractC13616e4;
        }
        abstractC13616e.f27024e = abstractC13616e2;
        abstractC13616e2.f27011e = abstractC13616e;
        return abstractC13616e2;
    }

    public static AbstractC13616e purchase(AbstractC13616e abstractC13616e) {
        boolean z = abstractC13616e.f27016e;
        if (z) {
            C17866e c17866e = AbstractC5180e.ad;
            if (!z) {
                AbstractC14070e.metrica("autoInvalidateRemovedNode called on unattached node");
            }
            AbstractC5180e.ad(abstractC13616e, -1, 2);
            abstractC13616e.mo2046e();
            abstractC13616e.mo2044e();
        }
        AbstractC13616e abstractC13616e2 = abstractC13616e.f27024e;
        AbstractC13616e abstractC13616e3 = abstractC13616e.f27011e;
        if (abstractC13616e2 != null) {
            abstractC13616e2.f27011e = abstractC13616e3;
            abstractC13616e.f27024e = null;
        }
        if (abstractC13616e3 != null) {
            abstractC13616e3.f27024e = abstractC13616e2;
            abstractC13616e.f27011e = null;
        }
        return abstractC13616e3;
    }

    public AbstractC17836e Signature(Uri uri) {
        C0492e c0492e = (C0492e) this.license;
        String str = (String) this.vip;
        C6843e c6843e = (C6843e) this.purchase;
        try {
            try {
                C9838e c9838e = (C9838e) this.yandex;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
                sb.append("Read ");
                sb.append(str);
                RunnableC1156e license = c9838e.license(sb.toString());
                try {
                    InputStream isPro = AbstractC17181e.isPro(c6843e.vip(uri));
                    try {
                        AbstractC15319e ad = ((C3466e) ((InterfaceC11283e) c0492e.ad.pro(7))).ad(isPro, c0492e.vip);
                        if (isPro != null) {
                            isPro.close();
                        }
                        license.close();
                        return ad;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        license.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw AbstractC14520e.adcel(c6843e, uri, e, str);
            }
        } catch (FileNotFoundException e2) {
            C11467e vip = c6843e.vip(uri);
            if (((InterfaceC1312e) vip.f23072e).vip((Uri) vip.f23071e)) {
                throw e2;
            }
            return c0492e.ad;
        }
    }

    public long adcel(long j) {
        return ((C11388e) ((Csuper) this.vip).f36469e).purchase(j);
    }

    public void admob(Uri uri, Object obj) {
        String str = (String) this.vip;
        C6843e c6843e = (C6843e) this.purchase;
        Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            C9838e c9838e = (C9838e) this.yandex;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
            sb.append("Write ");
            sb.append(str);
            RunnableC1156e license = c9838e.license(sb.toString());
            try {
                C17659e c17659e = new C17659e();
                try {
                    C11467e vip = c6843e.vip(build);
                    ArrayList m3208break = vip.m3208break(((InterfaceC1312e) vip.f23072e).license((Uri) vip.f23071e));
                    new C17659e[]{c17659e}[0].ad(m3208break);
                    OutputStream outputStream = (OutputStream) m3208break.get(0);
                    try {
                        ((AbstractC17836e) obj).vip(outputStream);
                        if (((C15387e) c17659e.f34612e) == null) {
                            throw new IOException("Cannot sync underlying stream");
                        }
                        ((OutputStream) c17659e.f34613e).flush();
                        ((C15387e) c17659e.f34612e).f30341e.getFD().sync();
                        outputStream.close();
                        license.close();
                        C11467e vip2 = c6843e.vip(build);
                        C11467e vip3 = c6843e.vip(uri);
                        InterfaceC1312e interfaceC1312e = (InterfaceC1312e) vip2.f23072e;
                        if (interfaceC1312e != ((InterfaceC1312e) vip3.f23072e)) {
                            throw new IOException("Cannot rename file across backends");
                        }
                        interfaceC1312e.purchase((Uri) vip2.f23071e, (Uri) vip3.f23071e);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw AbstractC14520e.adcel(c6843e, uri, e, str);
                }
            } catch (Throwable th3) {
                try {
                    license.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e2) {
            C11467e vip4 = c6843e.vip(build);
            if (((InterfaceC1312e) vip4.f23072e).vip((Uri) vip4.f23071e)) {
                try {
                    C11467e vip5 = c6843e.vip(build);
                    ((InterfaceC1312e) vip5.f23072e).appmetrica((Uri) vip5.f23071e);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0193, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0198, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a2, code lost:
    
        if (r14 <= r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a4, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a6, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b2, code lost:
    
        if (r0.ad(r14 - 1, r27 - 1) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b4, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bf, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c3, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c5, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c7, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c9, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cf, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d1, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0266, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01bb, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0196, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018f, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x017d, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0170, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x017b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026c, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0156, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d2, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014c, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0152, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0154, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0158, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0159, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015b, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015d, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015f, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016d, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0172, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0184, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018a, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018c, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0191, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void advert(int r32, defpackage.C12431e r33, defpackage.C12431e r34, defpackage.AbstractC13616e r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14742e.advert(int, eّّؔ, eّّؔ, eْۤۡ, boolean):void");
    }

    public void billing(Function1 function1) {
        Csuper csuper = (Csuper) this.vip;
        csuper.f36470e++;
        ((C12431e) csuper.f36471e).license(function1);
        csuper.Signature();
    }

    public C12488e license() {
        String str = ((String) this.vip) == null ? " mimeType" : BuildConfig.FLAVOR;
        if (((Integer) this.metrica) == null) {
            str = str.concat(" profile");
        }
        if (((EnumC14627e) this.license) == null) {
            str = AbstractC10257e.adcel(str, " inputTimebase");
        }
        if (((Size) this.appmetrica) == null) {
            str = AbstractC10257e.adcel(str, " resolution");
        }
        if (((Integer) this.purchase) == null) {
            str = AbstractC10257e.adcel(str, " colorFormat");
        }
        if (((C7248e) this.billing) == null) {
            str = AbstractC10257e.adcel(str, " dataSpace");
        }
        if (((Integer) this.yandex) == null) {
            str = AbstractC10257e.adcel(str, " captureFrameRate");
        }
        if (((Integer) this.startapp) == null) {
            str = AbstractC10257e.adcel(str, " encodeFrameRate");
        }
        if (((Integer) this.adcel) == null) {
            str = AbstractC10257e.adcel(str, " IFrameInterval");
        }
        if (((Integer) this.mopub) == null) {
            str = AbstractC10257e.adcel(str, " bitrate");
        }
        if (str.isEmpty()) {
            return new C12488e((String) this.vip, ((Integer) this.metrica).intValue(), (EnumC14627e) this.license, (Size) this.appmetrica, ((Integer) this.purchase).intValue(), (C7248e) this.billing, ((Integer) this.yandex).intValue(), ((Integer) this.startapp).intValue(), ((Integer) this.adcel).intValue(), ((Integer) this.mopub).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public ListenableFuture loadAd(C2111e c2111e, Executor executor) {
        ListenableFuture listenableFuture;
        synchronized (this.startapp) {
            ListenableFuture listenableFuture2 = (ListenableFuture) this.mopub;
            if (listenableFuture2 != null && listenableFuture2.isDone()) {
                try {
                    AbstractC2017e.vip((ListenableFuture) this.mopub);
                } catch (ExecutionException unused) {
                    this.mopub = null;
                }
            }
            if (((ListenableFuture) this.mopub) == null) {
                this.mopub = AbstractC2017e.appmetrica(((C16911e) this.adcel).m4223while(AbstractC9855e.ad(new C2383e(this)), (ExecutorC12022e) this.appmetrica));
            }
            listenableFuture = (ListenableFuture) this.mopub;
        }
        return ((C16911e) this.adcel).m4223while(AbstractC9855e.ad(new C11106e(this, listenableFuture, c2111e, executor, 25)), EnumC3320e.f7489e);
    }

    public C16611e metrica() {
        String str = ((String) this.vip) == null ? " transportName" : BuildConfig.FLAVOR;
        if (((C0974e) this.license) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.appmetrica) == null) {
            str = AbstractC10257e.adcel(str, " eventMillis");
        }
        if (((Long) this.purchase) == null) {
            str = AbstractC10257e.adcel(str, " uptimeMillis");
        }
        if (((HashMap) this.billing) == null) {
            str = AbstractC10257e.adcel(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new C16611e((String) this.vip, (Integer) this.metrica, (C0974e) this.license, ((Long) this.appmetrica).longValue(), ((Long) this.purchase).longValue(), (HashMap) this.billing, (Integer) this.yandex, (String) this.startapp, (byte[]) this.adcel, (byte[]) this.mopub);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void mopub() {
        for (AbstractC13616e abstractC13616e = (AbstractC13616e) this.billing; abstractC13616e != null; abstractC13616e = abstractC13616e.f27024e) {
            abstractC13616e.mo2049e();
            if (abstractC13616e.f27021e) {
                C17866e c17866e = AbstractC5180e.ad;
                if (!abstractC13616e.f27016e) {
                    AbstractC14070e.metrica("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC5180e.ad(abstractC13616e, -1, 1);
            }
            if (abstractC13616e.f27015e) {
                AbstractC5180e.metrica(abstractC13616e);
            }
            abstractC13616e.f27021e = false;
            abstractC13616e.f27015e = false;
        }
    }

    public void smaato() {
        C9157e c9157e;
        C13915e c13915e = (C13915e) this.vip;
        AbstractC17732e abstractC17732e = (C14747e) this.license;
        for (AbstractC13616e abstractC13616e = ((C9011e) this.purchase).f27011e; abstractC13616e != null; abstractC13616e = abstractC13616e.f27011e) {
            InterfaceC17303e metrica = AbstractC5851e.metrica(abstractC13616e);
            if (metrica != null) {
                AbstractC17732e abstractC17732e2 = abstractC13616e.f27018e;
                if (abstractC17732e2 != null) {
                    C9157e c9157e2 = (C9157e) abstractC17732e2;
                    InterfaceC17303e interfaceC17303e = c9157e2.f18322e;
                    c9157e2.m2523e(metrica);
                    c9157e = c9157e2;
                    if (interfaceC17303e != abstractC13616e) {
                        InterfaceC0983e interfaceC0983e = c9157e2.f34778e;
                        c9157e = c9157e2;
                        if (interfaceC0983e != null) {
                            ((C5048e) interfaceC0983e).invalidate();
                            c9157e = c9157e2;
                        }
                    }
                } else {
                    C9157e c9157e3 = new C9157e(c13915e, metrica);
                    abstractC13616e.mo2043e(c9157e3);
                    c9157e = c9157e3;
                }
                abstractC17732e.f34794e = c9157e;
                c9157e.f34777e = abstractC17732e;
                abstractC17732e = c9157e;
            } else {
                abstractC13616e.mo2043e(abstractC17732e);
            }
        }
        C13915e tapsense = c13915e.tapsense();
        abstractC17732e.f34794e = tapsense != null ? (C14747e) tapsense.f27592e.license : null;
        this.appmetrica = abstractC17732e;
    }

    public long startapp(long j) {
        return ((C11388e) ((Csuper) this.vip).f36469e).appmetrica(j);
    }

    public String toString() {
        switch (this.ad) {
            case 3:
                StringBuilder sb = new StringBuilder("[");
                AbstractC13616e abstractC13616e = (AbstractC13616e) this.billing;
                C9011e c9011e = (C9011e) this.purchase;
                if (abstractC13616e == c9011e) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (abstractC13616e != null && abstractC13616e != c9011e) {
                            sb.append(String.valueOf(abstractC13616e));
                            if (abstractC13616e.f27024e == c9011e) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                abstractC13616e = abstractC13616e.f27024e;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void vip(String str, String str2) {
        HashMap hashMap = (HashMap) this.billing;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public boolean yandex(int i) {
        return (i & ((AbstractC13616e) this.billing).f27020e) != 0;
    }
}
