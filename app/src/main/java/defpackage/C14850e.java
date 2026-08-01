package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2Placeholder;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.objects.music.SmartSuggestion;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٝٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14850e extends AbstractC15876e {

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final /* synthetic */ int f29390e = 3;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final /* synthetic */ Object f29391e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final Cpackage f29392e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14850e(C0567e c0567e) {
        super(null);
        this.f29391e = c0567e;
        this.f29392e = new C15177e(3, c0567e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14850e(C4390e c4390e, String str) {
        super(null);
        this.f29391e = c4390e;
        this.f29392e = new C14259e(c4390e, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14850e(String str) {
        super(null);
        this.f29391e = str;
        this.f29392e = new C6252e(str, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14850e(String str, String str2) {
        super(null);
        this.f29391e = str2;
        this.f29392e = new C6252e(str, 2);
    }

    @Override // defpackage.AbstractC15876e
    /* renamed from: const */
    public final Cpackage mo447const() {
        switch (this.f29390e) {
            case 0:
                return (C6252e) this.f29392e;
            case 1:
                return (C6252e) this.f29392e;
            case 2:
                return (C14259e) this.f29392e;
            default:
                return (C15177e) this.f29392e;
        }
    }

    @Override // defpackage.AbstractC15876e
    /* renamed from: eًًؓ */
    public Object mo1849e(Catalog2Section catalog2Section, C3675e c3675e, InterfaceC5083e interfaceC5083e) {
        switch (this.f29390e) {
            case 3:
                if (AbstractC5304e.m1866native((CharSequence) ((C0567e) this.f29391e).f2743e.getValue())) {
                    C7831e.f15835e.getClass();
                    if (!C7831e.ad().isEmpty()) {
                        List<String> ad = C7831e.ad();
                        for (String str : ad) {
                            c3675e.purchase.put("synth_" + str.hashCode(), new SmartSuggestion(str, BuildConfig.FLAVOR, "synth_fc", null, "synth_" + str.hashCode()));
                        }
                        ArrayList arrayList = new ArrayList(catalog2Section.license);
                        arrayList.add(0, new Catalog2Block.NoDataBlock("_synth_search_history", new Catalog2Layout.Separator(null, 1), null, null, null, null, 60));
                        List singletonList = Collections.singletonList(new Catalog2Button(C1850e.ad, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(ad, 10));
                        Iterator it = ad.iterator();
                        while (it.hasNext()) {
                            arrayList2.add("synth_" + ((String) it.next()).hashCode());
                        }
                        arrayList.add(0, new Catalog2Block.SearchSuggestionsBlock(24, "_synth_actual_search_history", null, singletonList, null, arrayList2, C17993e.ad));
                        VKXApplication.Companion companion = VKXApplication.f36531e;
                        arrayList.add(0, new Catalog2Block.NoDataBlock("_synth_search_history", new Catalog2Layout.CompactHeader(VKXApplication.Companion.vip(R.string.recent_searches)), Collections.singletonList(new Catalog2Button(C1850e.ad, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766)), null, null, null, 56));
                        catalog2Section.license = arrayList;
                    }
                }
                return catalog2Section;
            default:
                return catalog2Section;
        }
    }

    @Override // defpackage.AbstractC15876e, defpackage.InterfaceC8370e
    public boolean metrica() {
        switch (this.f29390e) {
            case 3:
                return true;
            default:
                return super.metrica();
        }
    }

    @Override // defpackage.AbstractC15876e, defpackage.InterfaceC8370e
    public String mopub() {
        switch (this.f29390e) {
            case 0:
                return "Поиск: " + ((String) this.f29391e);
            case 1:
                return "Поиск: " + ((String) this.f29391e);
            case 2:
            default:
                return super.mopub();
            case 3:
                return BuildConfig.FLAVOR;
        }
    }

    @Override // defpackage.AbstractC15876e, defpackage.AbstractC9870e
    /* renamed from: return */
    public Object mo215return(int i, InterfaceC5083e interfaceC5083e) {
        switch (this.f29390e) {
            case 2:
                if (((CharSequence) ((C4390e) this.f29391e).f9568e.getValue()).length() != 0) {
                    return AbstractC15876e.m4031for(this, i, (AbstractC10731e) interfaceC5083e);
                }
                C1169e license = AbstractC6874e.license();
                license.add(new Catalog2Block.PlaceholdersBlock(28, "x1", null, null, null, Collections.singletonList("synth_search"), C14691e.ad));
                Unit unit = Unit.INSTANCE;
                return Collections.singletonList(new Catalog2Response(null, new Catalog2Section("x0", BuildConfig.FLAVOR, null, AbstractC6874e.metrica(license), null, 20), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Collections.singletonList(new Catalog2Placeholder("synth_search", BuildConfig.FLAVOR, null, null, null)), null, null, null, null, null, null, null, null, null, 536346621));
            default:
                return super.mo215return(i, interfaceC5083e);
        }
    }

    @Override // defpackage.AbstractC15876e, defpackage.InterfaceC8370e
    public void signatures(String str) {
        switch (this.f29390e) {
            case 3:
                C7831e.f15835e.getClass();
                C7831e.vip(str);
                ((C0567e) this.f29391e).m375package(str, true);
                return;
            default:
                return;
        }
    }
}
