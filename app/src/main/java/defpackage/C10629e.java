package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۣۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10629e implements InterfaceC2183e, InterfaceC15169e, InterfaceC0569e, InterfaceC11305e, InterfaceC0566e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f20950e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f20951e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f20952e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20953e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final byte[] f20947e = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final byte[] f20949e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final long[] f20948e = {128, 64, 32, 16, 8, 4, 2, 1};

    public C10629e(int i) {
        this.f20953e = i;
        switch (i) {
            case 1:
                this.f20952e = new byte[8];
                return;
            case 4:
                this.f20952e = new C16911e(27);
                this.f20951e = 8000;
                this.f20950e = 8000;
                return;
            case 6:
                this.f20952e = new C10629e[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                this.f20951e = 0;
                this.f20950e = 0;
                return;
            default:
                return;
        }
    }

    public C10629e(int i, int i2, int i3) {
        this.f20953e = i3;
        switch (i3) {
            case 11:
                this.f20951e = i;
                this.f20950e = i2;
                float[] fArr = new float[3];
                Color.colorToHSV(0, fArr);
                float f = fArr[0];
                this.f20952e = (fArr[1] >= 0.5f || fArr[2] >= 0.7f) ? (f < 0.0f || f >= 20.0f) ? (f < 20.0f || f >= 45.0f) ? (f < 45.0f || f >= 69.0f) ? (f < 69.0f || f >= 160.0f) ? (f < 160.0f || f >= 200.0f) ? (f < 200.0f || f >= 260.0f) ? (f < 260.0f || f >= 275.0f) ? (f < 275.0f || f >= 300.0f) ? (f < 300.0f || f >= 340.0f) ? new C12916e(18, EnumC10769e.f21200e) : new C12916e(18, EnumC10769e.f21209e) : new C12916e(18, EnumC10769e.f21201e) : new C12916e(18, EnumC10769e.f21212e) : new C12916e(18, EnumC10769e.f21208e) : new C12916e(18, EnumC10769e.f21213e) : new C12916e(18, EnumC10769e.f21214e) : new C12916e(18, EnumC10769e.f21197e) : new C12916e(18, EnumC10769e.f21211e) : new C12916e(18, EnumC10769e.f21200e) : (f < 0.0f || f >= 20.0f) ? (f < 20.0f || f >= 50.0f) ? (f < 50.0f || f >= 90.0f) ? (f < 90.0f || f >= 160.0f) ? (f < 160.0f || f >= 180.0f) ? (f < 180.0f || f >= 260.0f) ? (f < 260.0f || f >= 280.0f) ? (f < 280.0f || f >= 300.0f) ? (f < 300.0f || f >= 340.0f) ? new C12916e(18, EnumC10769e.f21215e) : new C12916e(18, EnumC10769e.f21210e) : new C12916e(18, EnumC10769e.f21201e) : new C12916e(18, EnumC10769e.f21204e) : new C12916e(18, EnumC10769e.f21205e) : new C12916e(18, EnumC10769e.f21207e) : new C12916e(18, EnumC10769e.f21206e) : new C12916e(18, EnumC10769e.f21203e) : new C12916e(18, EnumC10769e.f21198e) : new C12916e(18, EnumC10769e.f21199e);
                return;
            default:
                this.f20952e = null;
                this.f20951e = i;
                int i4 = i2 & 7;
                this.f20950e = i4 == 0 ? 8 : i4;
                return;
        }
    }

    public C10629e(int i, int i2, InterfaceC17838e interfaceC17838e) {
        this.f20953e = 12;
        this.f20951e = i;
        this.f20950e = i2;
        this.f20952e = new C11467e(new C15495e(i, i2, interfaceC17838e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10629e(int i, int i2, Function2 function2) {
        this.f20953e = 9;
        this.f20951e = i;
        this.f20950e = i2;
        this.f20952e = (C7460e) function2;
    }

    public C10629e(Context context) {
        this.f20953e = 13;
        this.f20950e = 0;
        this.f20952e = context;
    }

    public C10629e(Context context, XmlResourceParser xmlResourceParser) {
        this.f20953e = 3;
        this.f20952e = new ArrayList();
        this.f20950e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC15320e.yandex);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f20951e = obtainStyledAttributes.getResourceId(index, this.f20951e);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f20950e);
                this.f20950e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C16732e().vip((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public C10629e(View view, int i, int i2) {
        this.f20953e = 7;
        this.f20951e = i;
        this.f20952e = view;
        this.f20950e = i2;
    }

    public C10629e(InterfaceC11305e interfaceC11305e, int i) {
        this.f20953e = 8;
        this.f20952e = interfaceC11305e;
        this.f20951e = i;
    }

    public C10629e(C12916e c12916e) {
        this.f20953e = 11;
        EnumC10769e enumC10769e = (EnumC10769e) c12916e.f25784e;
        this.f20951e = enumC10769e.f21217e;
        this.f20950e = enumC10769e.f21216e;
        this.f20952e = c12916e;
    }

    public C10629e(C18375e c18375e, C16975e c16975e) {
        this.f20953e = 2;
        C1292e c1292e = c18375e.f36046e;
        this.f20952e = c1292e;
        c1292e.m571try(12);
        int firebase = c1292e.firebase();
        if ("audio/raw".equals(c16975e.loadAd)) {
            int tapsense = AbstractC9413e.tapsense(c16975e.f33285this) * c16975e.f33282interface;
            if (firebase % tapsense != 0) {
                AbstractC2803e.smaato("BoxParsers", "Audio sample size mismatch. stsd sample size: " + tapsense + ", stsz sample size: " + firebase);
                firebase = tapsense;
            }
        }
        this.f20951e = firebase == 0 ? -1 : firebase;
        this.f20950e = c1292e.firebase();
    }

    public /* synthetic */ C10629e(Object obj, int i, int i2, int i3) {
        this.f20953e = i3;
        this.f20951e = i;
        this.f20950e = i2;
        this.f20952e = obj;
    }

    public static long mopub(int i, boolean z, byte[] bArr) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f20948e[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static void signatures(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(AbstractC12184e.license(i2));
    }

    @Override // defpackage.InterfaceC0566e
    public int Signature() {
        return this.f20950e;
    }

    @Override // defpackage.InterfaceC17717e
    public /* synthetic */ boolean ad() {
        return false;
    }

    @Override // defpackage.InterfaceC17717e
    public AbstractC3424e adcel(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return ((C11467e) this.f20952e).adcel(j, abstractC3424e, abstractC3424e2, abstractC3424e3);
    }

    @Override // defpackage.InterfaceC0566e
    public int admob() {
        return this.f20951e;
    }

    @Override // defpackage.InterfaceC11305e
    public void advert() {
        if (this.f20950e <= 0) {
            AbstractC1889e.ad("OffsetApplier up called with no corresponding down");
        }
        this.f20950e--;
        ((InterfaceC11305e) this.f20952e).advert();
    }

    @Override // defpackage.InterfaceC11305e
    public void amazon(int i, Object obj) {
        ((InterfaceC11305e) this.f20952e).amazon(i + (this.f20950e == 0 ? this.f20951e : 0), obj);
    }

    @Override // defpackage.InterfaceC11305e
    public void appmetrica(Object obj) {
        this.f20950e++;
        ((InterfaceC11305e) this.f20952e).appmetrica(obj);
    }

    @Override // defpackage.InterfaceC11305e
    public void billing() {
        ((InterfaceC11305e) this.f20952e).billing();
    }

    @Override // defpackage.InterfaceC0569e
    /* renamed from: extends */
    public C12948e mo378extends(View view, C12948e c12948e) {
        View view2 = (View) this.f20952e;
        int i = c12948e.ad.startapp(519).vip;
        int i2 = this.f20951e;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f20950e + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return c12948e;
    }

    @Override // defpackage.InterfaceC17717e
    public long inmobi(AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return (admob() + Signature()) * 1000000;
    }

    public synchronized int isPro() {
        int i = this.f20950e;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.f20952e;
        PackageManager packageManager = context.getPackageManager();
        if (((Context) C5277e.ad(context).ad).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!AbstractC11765e.metrica()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f20950e = i2;
                return i2;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i2 = 2;
            this.f20950e = i2;
            return i2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == AbstractC11765e.metrica()) {
            i2 = 2;
        }
        this.f20950e = i2;
        return i2;
    }

    public synchronized int isVip() {
        PackageInfo packageInfo;
        if (this.f20951e == 0) {
            try {
                packageInfo = C5277e.ad((Context) this.f20952e).metrica(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f20951e = packageInfo.versionCode;
            }
        }
        return this.f20951e;
    }

    @Override // defpackage.InterfaceC11305e
    public void license(int i, Object obj) {
        ((InterfaceC11305e) this.f20952e).license(i + (this.f20950e == 0 ? this.f20951e : 0), obj);
    }

    @Override // defpackage.InterfaceC11305e
    public /* synthetic */ void loadAd() {
    }

    @Override // defpackage.InterfaceC2183e
    public int metrica() {
        return this.f20950e;
    }

    @Override // defpackage.InterfaceC17717e
    public AbstractC3424e pro(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return ((C11467e) this.f20952e).pro(j, abstractC3424e, abstractC3424e2, abstractC3424e3);
    }

    @Override // defpackage.InterfaceC2183e
    public int purchase() {
        int i = this.f20951e;
        return i == -1 ? ((C1292e) this.f20952e).firebase() : i;
    }

    @Override // defpackage.InterfaceC15169e
    public InterfaceC9660e remoteconfig() {
        return new C14112e(this.f20951e, this.f20950e, (C16911e) this.f20952e);
    }

    @Override // defpackage.InterfaceC11305e
    public void smaato(Object obj, Function2 function2) {
        ((InterfaceC11305e) this.f20952e).smaato(obj, function2);
    }

    @Override // defpackage.InterfaceC11305e
    public void startapp(int i, int i2) {
        ((InterfaceC11305e) this.f20952e).startapp(i + (this.f20950e == 0 ? this.f20951e : 0), i2);
    }

    public long subscription(InterfaceC2283e interfaceC2283e, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = (byte[]) this.f20952e;
        if (this.f20951e == 0) {
            if (!interfaceC2283e.vip(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((f20948e[i4] & i3) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.f20950e = i2;
            if (i2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f20951e = 1;
        }
        int i5 = this.f20950e;
        if (i5 > i) {
            this.f20951e = 0;
            return -2L;
        }
        if (i5 != 1) {
            interfaceC2283e.readFully(bArr, 1, i5 - 1);
        }
        this.f20951e = 0;
        return mopub(this.f20950e, z2, bArr);
    }

    @Override // defpackage.InterfaceC17717e
    public AbstractC3424e tapsense(AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return ((C11467e) this.f20952e).adcel(inmobi(abstractC3424e, abstractC3424e2, abstractC3424e3), abstractC3424e, abstractC3424e2, abstractC3424e3);
    }

    public String toString() {
        switch (this.f20953e) {
            case 11:
                return "TintInfo{name: " + ((EnumC10769e) ((C12916e) this.f20952e).f25784e).name() + ", ColorA: 0x" + Integer.toHexString(this.f20951e) + ", ColorB: 0x" + Integer.toHexString(this.f20950e) + '}';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC2183e
    public int vip() {
        return this.f20951e;
    }

    @Override // defpackage.InterfaceC11305e
    public void yandex(int i, int i2, int i3) {
        int i4 = this.f20950e == 0 ? this.f20951e : 0;
        ((InterfaceC11305e) this.f20952e).yandex(i + i4, i2 + i4, i3);
    }
}
