package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import javax.crypto.AEADBadTagException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11130e implements InterfaceC2088e, InterfaceC10798e, InterfaceC15034e, InterfaceC16843e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f22046e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f22047e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22048e;

    public AbstractC11130e(int i) {
        this.f22048e = i;
        switch (i) {
            case 9:
                this.f22047e = AbstractC14430e.license(1);
                this.f22046e = new C8823e();
                return;
            case 10:
            default:
                this.f22046e = new int[2];
                return;
            case 11:
                ArrayList arrayList = new ArrayList();
                this.f22046e = arrayList;
                arrayList.add(new Object());
                return;
        }
    }

    public /* synthetic */ AbstractC11130e(int i, boolean z) {
        this.f22048e = i;
    }

    public AbstractC11130e(Context context) {
        this.f22048e = 5;
        this.f22047e = context;
    }

    public AbstractC11130e(AbstractC7255e abstractC7255e) {
        this.f22048e = 3;
        this.f22047e = new C11109e(1, this);
        this.f22046e = new C5601e(this, abstractC7255e);
    }

    public AbstractC11130e(LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e) {
        this.f22048e = 2;
        this.f22046e = layoutInflaterFactory2C8158e;
    }

    public AbstractC11130e(C14918e c14918e) {
        this.f22048e = 6;
        this.f22047e = c14918e;
        C14911e c14911e = c14918e.vip;
        this.f22046e = c14911e;
        c14911e.vip("Realm opened: " + this, new Object[0]);
    }

    public AbstractC11130e(InterfaceC16843e interfaceC16843e) {
        this.f22048e = 8;
        this.f22046e = new IdentityHashMap();
        this.f22047e = interfaceC16843e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eؘؑۢ, java.lang.Object] */
    public AbstractC11130e(InputStream inputStream) {
        this.f22048e = 4;
        EnumC11433e enumC11433e = EnumC11433e.f22984e;
        EnumC11433e enumC11433e2 = EnumC11433e.f22984e;
        ?? obj = new Object();
        obj.f1375e = new StringBuilder();
        obj.f1373e = new Scanner(inputStream, "utf-8").useLocale(Locale.US).useDelimiter("\\r?\\n");
        obj.f1376e = true;
        this.f22047e = obj;
        this.f22046e = enumC11433e;
    }

    public /* synthetic */ AbstractC11130e(Object obj, Object obj2, int i) {
        this.f22048e = i;
        this.f22046e = obj;
        this.f22047e = obj2;
    }

    public /* synthetic */ AbstractC11130e(Object obj, Object obj2, boolean z, int i) {
        this.f22048e = i;
        this.f22047e = obj;
        this.f22046e = obj2;
    }

    public AbstractC11130e(byte[] bArr) {
        this.f22048e = 12;
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f22047e = mo2751e(1, bArr);
        this.f22046e = mo2751e(0, bArr);
    }

    /* renamed from: eٕٗٛ, reason: contains not printable characters */
    public static byte[] m3029e(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    public void Signature(C4194e c4194e) {
        ((InterfaceC16843e) this.f22047e).Signature(c4194e);
    }

    /* renamed from: abstract */
    public long mo2061abstract() {
        return ((InterfaceC16843e) this.f22047e).mo2061abstract();
    }

    @Override // defpackage.InterfaceC15034e
    public InterfaceC15348e adcel() {
        return yandex();
    }

    public void admob(long j) {
        ((InterfaceC16843e) this.f22047e).admob(j);
    }

    public long ads() {
        return ((InterfaceC16843e) this.f22047e).ads();
    }

    public abstract IntentFilter amazon();

    public boolean applovin() {
        return ((InterfaceC16843e) this.f22047e).applovin();
    }

    public int billing() {
        return ((InterfaceC16843e) this.f22047e).billing();
    }

    /* renamed from: break */
    public int mo2062break() {
        return ((InterfaceC16843e) this.f22047e).mo2062break();
    }

    /* renamed from: case */
    public void mo2063case() {
        ((InterfaceC16843e) this.f22047e).mo2063case();
    }

    /* renamed from: catch */
    public float mo2064catch() {
        return ((InterfaceC16843e) this.f22047e).mo2064catch();
    }

    /* renamed from: class */
    public void mo2065class(C1962e c1962e, long j) {
        ((InterfaceC16843e) this.f22047e).mo2065class(c1962e, j);
    }

    /* renamed from: const */
    public abstract int[] mo450const(int i);

    /* renamed from: continue */
    public void mo2066continue() {
        ((InterfaceC16843e) this.f22047e).mo2066continue();
    }

    /* renamed from: default */
    public int mo2067default() {
        return ((InterfaceC16843e) this.f22047e).mo2067default();
    }

    /* renamed from: else */
    public void mo2068else(int i) {
        ((InterfaceC16843e) this.f22047e).mo2068else(i);
    }

    /* renamed from: eَؑۨ */
    public void mo2069e(int i, int i2, int i3) {
        ((InterfaceC16843e) this.f22047e).mo2069e(i, i2, i3);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؚؑ۟, reason: contains not printable characters */
    public Looper mo3030e() {
        return ((InterfaceC16843e) this.f22047e).mo3030e();
    }

    /* renamed from: eۣؑۡ */
    public void mo2808e() {
    }

    /* renamed from: eؑۥؘ */
    public void mo2070e(int i, List list) {
        ((InterfaceC16843e) this.f22047e).mo2070e(i, list);
    }

    /* renamed from: eؒ٘ؗ */
    public long mo2071e() {
        return ((InterfaceC16843e) this.f22047e).mo2071e();
    }

    /* renamed from: eؒٚۨ */
    public void mo2072e() {
        ((InterfaceC16843e) this.f22047e).mo2072e();
    }

    /* renamed from: eٟؒؗ */
    public abstract int mo2982e();

    /* renamed from: eؒۖۗ */
    public C9039e mo2074e() {
        return ((InterfaceC16843e) this.f22047e).mo2074e();
    }

    /* renamed from: eؒۤۨ */
    public long mo2075e() {
        return ((InterfaceC16843e) this.f22047e).mo2075e();
    }

    /* renamed from: eّؔٞ */
    public void mo2076e(List list) {
        ((InterfaceC16843e) this.f22047e).mo2076e(list);
    }

    /* renamed from: eِؕٛ */
    public void mo2077e() {
        ((InterfaceC16843e) this.f22047e).mo2077e();
    }

    /* renamed from: eؘْؖ */
    public void mo2078e() {
        ((InterfaceC16843e) this.f22047e).mo2078e();
    }

    /* renamed from: eٍؖۙ */
    public boolean mo2079e() {
        return ((InterfaceC16843e) this.f22047e).mo2079e();
    }

    /* renamed from: eًؖٝ */
    public InterfaceC1108e mo1504e(InterfaceC8632e interfaceC8632e, C6571e c6571e) {
        throw new UnsupportedOperationException("Observing changes are not supported by this Realm.");
    }

    /* renamed from: eٌؖۡ */
    public void mo2080e() {
        ((InterfaceC16843e) this.f22047e).mo2080e();
    }

    /* renamed from: eؖۡٝ */
    public boolean mo2081e() {
        return ((InterfaceC16843e) this.f22047e).mo2081e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؗۦۣ, reason: contains not printable characters */
    public boolean mo3031e() {
        return ((InterfaceC16843e) this.f22047e).mo3031e();
    }

    /* renamed from: eؘؕۥ */
    public boolean mo2083e() {
        return ((InterfaceC16843e) this.f22047e).mo2083e();
    }

    /* renamed from: eؘُٔ */
    public C12053e mo2085e() {
        return ((InterfaceC16843e) this.f22047e).mo2085e();
    }

    /* renamed from: eؘٕۚ */
    public void mo2086e(boolean z) {
        ((InterfaceC16843e) this.f22047e).mo2086e(z);
    }

    /* renamed from: eؙؖؗ */
    public int mo2088e() {
        return ((InterfaceC16843e) this.f22047e).mo2088e();
    }

    /* renamed from: eؙؙٝ */
    public abstract AbstractC15825e mo2751e(int i, byte[] bArr);

    /* renamed from: eٍؙّ */
    public C12053e mo2089e() {
        return ((InterfaceC16843e) this.f22047e).mo2089e();
    }

    /* renamed from: eؙۛ۠ */
    public abstract void mo2983e();

    /* renamed from: eؚؚؓ */
    public int mo2090e() {
        return ((InterfaceC16843e) this.f22047e).mo2090e();
    }

    /* renamed from: eؚٜ۠ */
    public boolean mo2091e() {
        return ((InterfaceC16843e) this.f22047e).mo2091e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public void mo3032e(C3335e c3335e, boolean z) {
        ((InterfaceC16843e) this.f22047e).mo3032e(c3335e, z);
    }

    /* renamed from: eًًؓ */
    public void mo2092e(int i) {
        ((InterfaceC16843e) this.f22047e).mo2092e(i);
    }

    /* renamed from: eًٓؓ */
    public abstract int[] mo454e(int i);

    /* renamed from: eٌؙٞ */
    public void mo2093e() {
        ((InterfaceC16843e) this.f22047e).mo2093e();
    }

    /* renamed from: eٌۘۤ */
    public void mo2094e(int i, long j, List list) {
        ((InterfaceC16843e) this.f22047e).mo2094e(i, j, list);
    }

    /* renamed from: eٌۡٔ */
    public abstract void mo2004e();

    /* renamed from: eٍؓۙ */
    public void mo2095e(int i) {
        ((InterfaceC16843e) this.f22047e).mo2095e(i);
    }

    /* renamed from: eٍۢؒ, reason: contains not printable characters */
    public int[] m3033e(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.f22046e;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* renamed from: eَٖٓ */
    public void mo2096e(C12053e c12053e) {
        ((InterfaceC16843e) this.f22047e).mo2096e(c12053e);
    }

    /* renamed from: eُٓؓ */
    public long mo2097e() {
        return ((InterfaceC16843e) this.f22047e).mo2097e();
    }

    /* renamed from: eُؚٕ */
    public long mo2098e() {
        return ((InterfaceC16843e) this.f22047e).mo2098e();
    }

    /* renamed from: eُۘٙ, reason: contains not printable characters */
    public MenuItem m3034e(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC4281e)) {
            return menuItem;
        }
        InterfaceMenuItemC4281e interfaceMenuItemC4281e = (InterfaceMenuItemC4281e) menuItem;
        if (((C17519e) this.f22046e) == null) {
            this.f22046e = new C17519e(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C17519e) this.f22046e).get(interfaceMenuItemC4281e);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC4494e menuItemC4494e = new MenuItemC4494e((Context) this.f22047e, interfaceMenuItemC4281e);
        ((C17519e) this.f22046e).put(interfaceMenuItemC4281e, menuItemC4494e);
        return menuItemC4494e;
    }

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public void m3035e() {
        mopub();
        IntentFilter amazon = amazon();
        if (amazon.countActions() == 0) {
            return;
        }
        if (((C13264e) this.f22047e) == null) {
            this.f22047e = new C13264e(1, this);
        }
        ((LayoutInflaterFactory2C8158e) this.f22046e).f16587e.registerReceiver((C13264e) this.f22047e, amazon);
    }

    /* renamed from: eِؗؓ */
    public int mo2100e() {
        return ((InterfaceC16843e) this.f22047e).mo2100e();
    }

    /* renamed from: eؙِۡ */
    public void mo2101e(List list) {
        ((InterfaceC16843e) this.f22047e).mo2101e(list);
    }

    /* renamed from: eّّۚ */
    public void mo2102e(C1962e c1962e) {
        ((InterfaceC16843e) this.f22047e).mo2102e(c1962e);
    }

    /* renamed from: eّْٝ */
    public void mo2103e(C1962e c1962e) {
        ((InterfaceC16843e) this.f22047e).mo2103e(c1962e);
    }

    /* renamed from: eّ۟ٝ */
    public void mo2809e(C0419e c0419e) {
    }

    /* renamed from: eًْٕ */
    public C4491e mo2104e() {
        return ((InterfaceC16843e) this.f22047e).mo2104e();
    }

    /* renamed from: eْٗۚ */
    public void mo2810e() {
    }

    /* renamed from: eْۢؕ */
    public AbstractC6690e mo2105e() {
        return ((InterfaceC16843e) this.f22047e).mo2105e();
    }

    /* renamed from: eْۥؑ, reason: contains not printable characters */
    public String m3036e(String str) {
        List list = (List) this.f22046e;
        int billing = AbstractC6874e.billing(list);
        if (billing < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            C4839e c4839e = (C4839e) list.get(i);
            if (AbstractC6507e.loadAd(c4839e.ad, str, true)) {
                return c4839e.vip;
            }
            if (i == billing) {
                return null;
            }
            i++;
        }
    }

    /* renamed from: eٍٓۢ */
    public int mo2106e() {
        return ((InterfaceC16843e) this.f22047e).mo2106e();
    }

    /* renamed from: eِٓۦ */
    public boolean mo2107e(int i) {
        return ((InterfaceC16843e) this.f22047e).mo2107e(i);
    }

    /* renamed from: eٓٔؔ */
    public abstract boolean mo741e();

    /* renamed from: eٓٛۢ */
    public boolean mo2108e() {
        return ((InterfaceC16843e) this.f22047e).mo2108e();
    }

    /* renamed from: eٔؖۘ */
    public void mo2109e() {
        ((InterfaceC16843e) this.f22047e).mo2109e();
    }

    /* renamed from: eٌٔٗ */
    public void mo2110e(int i, C1962e c1962e) {
        ((InterfaceC16843e) this.f22047e).mo2110e(i, c1962e);
    }

    /* renamed from: eّٔؖ */
    public void mo2111e(int i) {
        ((InterfaceC16843e) this.f22047e).mo2111e(i);
    }

    /* renamed from: eّٔؗ */
    public long mo2112e() {
        return ((InterfaceC16843e) this.f22047e).mo2112e();
    }

    /* renamed from: eٍٟٔ */
    public C1962e mo2113e() {
        return ((InterfaceC16843e) this.f22047e).mo2113e();
    }

    /* renamed from: eٕؓٝ */
    public int mo2115e() {
        return ((InterfaceC16843e) this.f22047e).mo2115e();
    }

    /* renamed from: eٕٙؗ */
    public long mo2116e() {
        return ((InterfaceC16843e) this.f22047e).mo2116e();
    }

    /* renamed from: eؘٖؗ */
    public void mo2117e(int i, int i2) {
        ((InterfaceC16843e) this.f22047e).mo2117e(i, i2);
    }

    /* renamed from: eٖٔۧ */
    public void mo2118e() {
        ((InterfaceC16843e) this.f22047e).mo2118e();
    }

    /* renamed from: eٟٗۦ */
    public C18255e mo2119e() {
        return ((InterfaceC16843e) this.f22047e).mo2119e();
    }

    /* renamed from: e٘ٓۜ */
    public boolean mo2120e() {
        return ((InterfaceC16843e) this.f22047e).mo2120e();
    }

    /* renamed from: e٘ٔ٘ */
    public void mo2121e(InterfaceC8524e interfaceC8524e) {
        synchronized (((IdentityHashMap) this.f22046e)) {
            InterfaceC8524e interfaceC8524e2 = (InterfaceC8524e) ((IdentityHashMap) this.f22046e).remove(interfaceC8524e);
            InterfaceC16843e interfaceC16843e = (InterfaceC16843e) this.f22047e;
            if (interfaceC8524e2 != null) {
                interfaceC8524e = interfaceC8524e2;
            }
            interfaceC16843e.mo2121e(interfaceC8524e);
        }
    }

    /* renamed from: eؙٟ٘ */
    public void mo2123e(boolean z) {
        ((InterfaceC16843e) this.f22047e).mo2123e(z);
    }

    /* renamed from: e٘ۡؗ */
    public boolean mo2124e() {
        return ((InterfaceC16843e) this.f22047e).mo2124e();
    }

    /* renamed from: e۠۟, reason: contains not printable characters */
    public boolean m3037e() {
        return ((C11109e) this.f22047e).vip && ((C5601e) this.f22046e).vip;
    }

    /* renamed from: final */
    public void mo2125final() {
        ((InterfaceC16843e) this.f22047e).mo2125final();
    }

    /* renamed from: finally */
    public abstract void mo689finally(long[] jArr, long[] jArr2);

    public C5298e firebase() {
        return ((InterfaceC16843e) this.f22047e).firebase();
    }

    /* renamed from: for */
    public void mo2126for(float f) {
        ((InterfaceC16843e) this.f22047e).mo2126for(f);
    }

    public long getDuration() {
        return ((InterfaceC16843e) this.f22047e).getDuration();
    }

    /* renamed from: implements */
    public C2351e mo2127implements() {
        return ((InterfaceC16843e) this.f22047e).mo2127implements();
    }

    /* renamed from: import */
    public int mo2128import() {
        return ((InterfaceC16843e) this.f22047e).mo2128import();
    }

    /* renamed from: instanceof, reason: not valid java name */
    public byte[] m3038instanceof(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((AbstractC15825e) this.f22046e).ad(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(AbstractC5336e.metrica(bArr4, m3029e(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            AbstractC15825e abstractC15825e = (AbstractC15825e) this.f22047e;
            abstractC15825e.getClass();
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            abstractC15825e.admob(bArr, allocate, byteBuffer);
            return allocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    /* renamed from: interface */
    public boolean mo2129interface() {
        return ((InterfaceC16843e) this.f22047e).mo2129interface();
    }

    public boolean isClosed() {
        return yandex().isClosed();
    }

    @Override // defpackage.InterfaceC4654e
    public boolean isFrozen() {
        return AbstractC0054e.advert(this);
    }

    public int isPro() {
        return ((InterfaceC16843e) this.f22047e).isPro();
    }

    public C4194e isVip() {
        return ((InterfaceC16843e) this.f22047e).isVip();
    }

    public void license() {
        ((InterfaceC16843e) this.f22047e).license();
    }

    public void loadAd() {
        ((InterfaceC16843e) this.f22047e).loadAd();
    }

    public void mopub() {
        C13264e c13264e = (C13264e) this.f22047e;
        if (c13264e != null) {
            try {
                ((LayoutInflaterFactory2C8158e) this.f22046e).f16587e.unregisterReceiver(c13264e);
            } catch (IllegalArgumentException unused) {
            }
            this.f22047e = null;
        }
    }

    /* renamed from: native */
    public void mo2130native(boolean z) {
        ((InterfaceC16843e) this.f22047e).mo2130native(z);
    }

    /* renamed from: new */
    public C5251e mo2131new() {
        return ((InterfaceC16843e) this.f22047e).mo2131new();
    }

    /* renamed from: package */
    public void mo2132package(int i, int i2) {
        ((InterfaceC16843e) this.f22047e).mo2132package(i, i2);
    }

    public long premium() {
        return ((InterfaceC16843e) this.f22047e).premium();
    }

    /* renamed from: private, reason: not valid java name */
    public void m3039private() {
        C11498e c11498e = (C11498e) this.f22047e;
        c11498e.getClass();
        if (C11498e.vip.decrementAndGet(c11498e) == 0) {
            ((C8823e) this.f22046e).m2175import(new C4418e(new C3110e(2)));
            release();
        }
    }

    public void pro() {
        ((InterfaceC16843e) this.f22047e).pro();
    }

    /* renamed from: protected */
    public void mo2133protected(InterfaceC8524e interfaceC8524e) {
        synchronized (((IdentityHashMap) this.f22046e)) {
            try {
                C6038e c6038e = (C6038e) ((IdentityHashMap) this.f22046e).get(interfaceC8524e);
                if (c6038e == null) {
                    c6038e = new C6038e(this, interfaceC8524e);
                }
                ((InterfaceC16843e) this.f22047e).mo2133protected(c6038e);
                ((IdentityHashMap) this.f22046e).put(interfaceC8524e, c6038e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: public */
    public C8256e mo2134public() {
        return ((InterfaceC16843e) this.f22047e).mo2134public();
    }

    public void purchase(float f) {
        ((InterfaceC16843e) this.f22047e).purchase(f);
    }

    public void release() {
        ((InterfaceC16843e) this.f22047e).release();
    }

    /* renamed from: return */
    public abstract void mo690return(long[] jArr, long[] jArr2);

    public void signatures(int i) {
        ((InterfaceC16843e) this.f22047e).signatures(i);
    }

    public C3335e smaato() {
        return ((InterfaceC16843e) this.f22047e).smaato();
    }

    public int startapp() {
        return ((InterfaceC16843e) this.f22047e).startapp();
    }

    /* renamed from: static */
    public void mo2135static(int i, int i2, List list) {
        ((InterfaceC16843e) this.f22047e).mo2135static(i, i2, list);
    }

    public void stop() {
        ((InterfaceC16843e) this.f22047e).stop();
    }

    /* renamed from: strictfp */
    public void mo2136strictfp() {
        ((InterfaceC16843e) this.f22047e).mo2136strictfp();
    }

    public void subs(int i, long j) {
        ((InterfaceC16843e) this.f22047e).subs(i, j);
    }

    public boolean subscription() {
        return ((InterfaceC16843e) this.f22047e).subscription();
    }

    /* renamed from: super */
    public void mo2137super(int i, boolean z) {
        ((InterfaceC16843e) this.f22047e).mo2137super(i, z);
    }

    /* renamed from: switch, reason: not valid java name */
    public void m3040switch(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = byteBuffer.position();
        AbstractC15825e abstractC15825e = (AbstractC15825e) this.f22047e;
        abstractC15825e.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        abstractC15825e.admob(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        ((AbstractC15825e) this.f22046e).ad(0, bArr).get(bArr4);
        byte[] metrica = AbstractC5336e.metrica(bArr4, m3029e(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(metrica);
    }

    /* renamed from: synchronized */
    public void mo2138synchronized(C4491e c4491e) {
        ((InterfaceC16843e) this.f22047e).mo2138synchronized(c4491e);
    }

    /* renamed from: this */
    public void mo2139this() {
        ((InterfaceC16843e) this.f22047e).mo2139this();
    }

    @Override // defpackage.InterfaceC10798e
    /* renamed from: throw */
    public C17621e mo661throw() {
        return AbstractC0054e.remoteconfig(this);
    }

    /* renamed from: throws */
    public void mo2140throws(int i, int i2) {
        ((InterfaceC16843e) this.f22047e).mo2140throws(i, i2);
    }

    public String toString() {
        switch (this.f22048e) {
            case 6:
                return AbstractC3820e.ad.vip(getClass()).mopub() + "[" + ((C14918e) this.f22047e).metrica + "}]";
            case 10:
                String str = (String) this.f22047e;
                List<C4839e> list = (List) this.f22046e;
                if (list.isEmpty()) {
                    return str;
                }
                int length = str.length();
                int i = 0;
                int i2 = 0;
                for (C4839e c4839e : list) {
                    i2 += c4839e.vip.length() + c4839e.ad.length() + 3;
                }
                StringBuilder sb = new StringBuilder(length + i2);
                sb.append(str);
                int billing = AbstractC6874e.billing(list);
                if (billing >= 0) {
                    while (true) {
                        C4839e c4839e2 = (C4839e) list.get(i);
                        sb.append("; ");
                        sb.append(c4839e2.ad);
                        sb.append("=");
                        String str2 = c4839e2.vip;
                        if (AbstractC0383e.ad(str2)) {
                            sb.append(AbstractC0383e.vip(str2));
                        } else {
                            sb.append(str2);
                        }
                        if (i != billing) {
                            i++;
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: transient */
    public void mo2141transient(int i) {
        ((InterfaceC16843e) this.f22047e).mo2141transient(i);
    }

    /* renamed from: try */
    public long mo2142try() {
        return ((InterfaceC16843e) this.f22047e).mo2142try();
    }

    /* renamed from: volatile */
    public void mo2143volatile(SurfaceHolder surfaceHolder) {
        ((InterfaceC16843e) this.f22047e).mo2143volatile(surfaceHolder);
    }

    /* renamed from: while */
    public int mo2144while() {
        return ((InterfaceC16843e) this.f22047e).mo2144while();
    }

    public abstract InterfaceC15348e yandex();
}
